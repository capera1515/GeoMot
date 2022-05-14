/**
 * 
 */
package com.wsgeomot.co.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsgeomot.co.dao.GeoMotDao;
import com.wsgeomot.co.model.dto.ContactoDTO;
import com.wsgeomot.co.model.dto.ControlEstadoMotoDTO;
import com.wsgeomot.co.model.dto.KilometrajenotificacionDTO;
import com.wsgeomot.co.model.dto.MotoDTO;
import com.wsgeomot.co.model.dto.PersonaContactoRequest;
import com.wsgeomot.co.model.dto.PersonaDTO;
import com.wsgeomot.co.model.dto.RequesInfoGeneral;
import com.wsgeomot.co.model.dto.StatusResponse;
import com.wsgeomot.co.model.entity.ContactoEntity;
import com.wsgeomot.co.model.entity.ControlEstadoMotoEntity;
import com.wsgeomot.co.model.entity.KilometrajenotificacionEntity;
import com.wsgeomot.co.model.entity.MotoEntity;
import com.wsgeomot.co.model.entity.PersonaEntity;
import com.wsgeomot.co.model.response.ResponseContacto;
import com.wsgeomot.co.model.response.ResponseContactoGL;
import com.wsgeomot.co.model.response.ResponseEventoPlantillaDTO;
import com.wsgeomot.co.model.response.ResponseKilometrajenotificacion;
import com.wsgeomot.co.model.response.ResponseMaestraLista;
import com.wsgeomot.co.model.response.ResponseMotoEntity;
import com.wsgeomot.co.model.response.ResponsePersonaEntity;
import com.wsgeomot.co.service.GeoMotService;
import com.wsgeomot.util.ResponseCodes;
import com.wsgeomot.util.ValidateGeneral;

/**
 * @author Andres Capera
 *
 */
@Service
@Transactional
public class GeoMotServiceImpl implements GeoMotService {

	@Autowired
	private GeoMotDao service;

	ValidateGeneral validateGeneral = new ValidateGeneral();

	private static final Logger logger = Logger.getLogger(GeoMotServiceImpl.class);

	public static final int VL = 1;
	public static final String KL = "S";

	/**
	 * METODO DE CONSULTA DE INFORMACION GENERAL PERSONA MOTO
	 * 
	 * @param tipoDocumento
	 * @param numDocumento
	 * @param placa
	 * @return RequesInfoGeneral
	 */
	public RequesInfoGeneral getInfoMotoPersona(Integer tipoDocumento, String numDocumento, String placa) {
		return service.getInfoMotoPersona(tipoDocumento, numDocumento, placa);
	}

	/**
	 * METODO DE CONSULTA DE EVENTOS Y PLANTILLAS
	 * 
	 * @param idEvento
	 * @returnResponseEventoPlantillaDTO
	 */
	public ResponseEventoPlantillaDTO getEventoPlantilla(Integer idEvento) {
		return service.getEventoPlantilla(idEvento);
	}

	/**
	 * METODO DE CONSULTA DE LISTAS MAESTRAS
	 * 
	 * @param tipoDocumento
	 * @param numDocumento
	 * @param placa
	 * @return ResponseMaestraLista
	 */
	public ResponseMaestraLista getInfoListasMaestras(String tipoDato) {
		return service.getInfoListasMaestras(tipoDato);
	}

	/**
	 * METODO DE REGISTRO DE PERSONA Y CONTACTO
	 * 
	 * @param persoContacRequest
	 * @return ResponseContactoGL
	 */
	public ResponseContactoGL insertUpdatePersonaContactoDTO(PersonaContactoRequest persoContacRequest) {
		StatusResponse statusResponse = ResponseCodes.SUCCESS;
		ResponseContactoGL responseContactoGL = new ResponseContactoGL();
		ResponsePersonaEntity responsePersonaEntity = new ResponsePersonaEntity();
		try {
			statusResponse = validateGeneral.validate(persoContacRequest.getPersonaDTO());
			if (statusResponse.getStatus().equals(ResponseCodes.SUCCESS.getStatus())) {
				responsePersonaEntity = insertUpdatetPersona(
						maperPersonaDTOToEntity(persoContacRequest.getPersonaDTO()));
			}

			if (responsePersonaEntity.getStatusResponse().getStatus().equals(ResponseCodes.SUCCESS.getStatus())) {
				responseContactoGL = insertUpdateContactoListDTO(persoContacRequest.getContactoDTOList(),
						responsePersonaEntity.getPersonaEntity().getIdPersona());
				responseContactoGL.setPersona(responsePersonaEntity.getPersonaEntity());
			} else {
				responseContactoGL.setStatusResponse(statusResponse);
			}

		} catch (Exception e) {
			responseContactoGL.setStatusResponse(ResponseCodes.TECHNICAL_ERROR);
			String message = "GeoMotServiceImpl insertUpdateGeneral" + e.getMessage() + e.getCause();
			logger.error(message);
		}
		return responseContactoGL;

	}

	/**
	 * METODO DE RESGISTRO O ACTUALIZACION DE PERSONA
	 * 
	 * @param PersonaDTO
	 * @return insertUpdatePersonaDTO
	 */
	public ResponsePersonaEntity insertUpdatePersonaDTO(PersonaDTO persona) {
		ResponsePersonaEntity responsePersonaEntity = new ResponsePersonaEntity();
		try {
			StatusResponse statusResponse = validateGeneral.validate(persona);
			if (statusResponse.getStatus().equals(ResponseCodes.SUCCESS.getStatus())) {
				responsePersonaEntity = insertUpdatetPersona(maperPersonaDTOToEntity(persona));
			} else {
				responsePersonaEntity.setStatusResponse(statusResponse);
			}
		} catch (Exception e) {
			responsePersonaEntity.setStatusResponse(ResponseCodes.TECHNICAL_ERROR);
			String message = "GeoMotServiceImpl insertUpdateGeneral" + e.getMessage() + e.getCause();
			logger.error(message);
		}
		return responsePersonaEntity;

	}

	/**
	 * METODO DE REGISTRO O ACTUALIZACION CONTACTO DE PERSONA
	 * 
	 * @param ContactoDTO
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdateContactoDTO(ContactoDTO contacto) {
		StatusResponse statusResponse = ResponseCodes.SUCCESS;
		try {
			statusResponse = validateGeneral.validate(contacto);
			if (statusResponse.getStatus().equals(ResponseCodes.SUCCESS.getStatus())) {
				statusResponse = insertUpdatetContacto(maperContactoDTOToEntity(contacto));
			}
		} catch (Exception e) {
			statusResponse = ResponseCodes.TECHNICAL_ERROR;
			String message = "GeoMotServiceImpl insertUpdateContactoDTO" + e.getMessage() + e.getCause();
			logger.error(message);
		}
		return statusResponse;

	}

	/**
	 * 
	 * @param contactoDTOList
	 * @return ResponseContactoGL
	 */
	public ResponseContactoGL insertUpdateContactoListDTO(List<ContactoDTO> contactoDTOList, Integer idperson) {
		ResponseContactoGL responseContactoGL = new ResponseContactoGL();
		StatusResponse statusResponse = ResponseCodes.SUCCESS;
		List<ResponseContacto> responseContacto = new ArrayList<>();
		try {
			responseContactoGL.setStatusResponse(ResponseCodes.SUCCESS);
			if (!contactoDTOList.isEmpty() && (contactoDTOList.get(0) != null)) {
				for (ContactoDTO contactoDTO : contactoDTOList) {
					ResponseContacto listaRest = new ResponseContacto();
					contactoDTO.setIdPersona(idperson);
					statusResponse = insertUpdateContactoDTO(contactoDTO);
					listaRest.setStatusResponse(statusResponse);
					listaRest.setContacto(contactoDTO);
					responseContacto.add(listaRest);
				}
				responseContactoGL.setStatusResponse(ResponseCodes.SUCCESS);
				responseContactoGL.setResponseContacto(responseContacto);
			}
		} catch (Exception e) {
			responseContactoGL.setStatusResponse(ResponseCodes.TECHNICAL_ERROR);
			String message = "GeoMotServiceImpl insertUpdateContactoListDTO" + e.getMessage() + e.getCause();
			logger.error(message);
		}
		return responseContactoGL;

	}

	/**
	 * METODO DE REGISTRO O ACTUALIZACION DE MOTO
	 * 
	 * @param MotoDTO
	 * @return StatusResponse
	 */
	public ResponseMotoEntity insertUpdateMotoDTO(MotoDTO motoDTO) {
		ResponseMotoEntity responseMotoEntity = new ResponseMotoEntity();
		try {
			StatusResponse statusResponse = validateGeneral.validate(motoDTO);
			if (statusResponse.getStatus().equals(ResponseCodes.SUCCESS.getStatus())) {
				responseMotoEntity = insertUpdatetMoto(maperMotoDTOToEntity(motoDTO));
			} else {
				responseMotoEntity.setStatusResponse(statusResponse);
			}
		} catch (Exception e) {
			responseMotoEntity.setStatusResponse(ResponseCodes.TECHNICAL_ERROR);
			String message = "GeoMotServiceImpl insertUpdateMotoDTO" + e.getMessage() + e.getCause();
			logger.error(message);
		}
		return responseMotoEntity;

	}

	/**
	 * METODO DE REGISTRO O ACTUALIZACION DE ESTADO KILOMETRAJE MOTO
	 * 
	 * @param ControlEstadoMotoDTO
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdateContEstadoMotoDTO(ControlEstadoMotoDTO controlEstadoMoto) {
		StatusResponse statusResponse = ResponseCodes.SUCCESS;
		try {
			statusResponse = validateGeneral.validate(controlEstadoMoto);
			if (statusResponse.getStatus().equals(ResponseCodes.SUCCESS.getStatus())) {
				statusResponse = insertUpdatetControlEstadoMoto(maperControlEstadoMotoDTOToEntity(controlEstadoMoto));
			}
		} catch (Exception e) {
			statusResponse = ResponseCodes.TECHNICAL_ERROR;
			String message = "GeoMotServiceImpl insertUpdateContEstadoMotoDTO" + e.getMessage() + e.getCause();
			logger.error(message);
		}
		return statusResponse;

	}

	/**
	 * METODO DE REGISTRO DE KILOMETRAJE DE NOTIFICACION DE MOTO
	 * 
	 * @param KilometrajenotificacionDTO
	 * @return StatusResponse
	 */
	public ResponseKilometrajenotificacion insertUpdateKilometrajenotificacionDTO(
			KilometrajenotificacionDTO kilometrajenotificacion) {
		ResponseKilometrajenotificacion responseKilometrajenotificacion = new ResponseKilometrajenotificacion();
		try {
			StatusResponse statusResponse = validateGeneral.validate(kilometrajenotificacion);
			if (statusResponse.getStatus().equals(ResponseCodes.SUCCESS.getStatus())) {
				responseKilometrajenotificacion = insertUpdatetKilometrajenotificacion(
						maperKilometrajenotificacionDTOToEntity(kilometrajenotificacion));
			} else {
				responseKilometrajenotificacion.setStatusResponse(statusResponse);
			}
		} catch (Exception e) {
			responseKilometrajenotificacion.setStatusResponse(ResponseCodes.TECHNICAL_ERROR);
			String message = "GeoMotServiceImpl insertUpdateKilometrajenotificacionDTO" + e.getMessage() + e.getCause();
			logger.error(message);
		}
		return responseKilometrajenotificacion;

	}

	/**
	 * 
	 * @param PersonaEntity
	 * @return StatusResponse
	 */
	public ResponsePersonaEntity insertUpdatetPersona(PersonaEntity entity) {
		return service.insertUpdatetPersona(entity);
	}

	/**
	 * 
	 * @param PersonaDTO
	 * @return PersonaEntity
	 */
	public PersonaEntity maperPersonaDTOToEntity(PersonaDTO personaDTO) {
		PersonaEntity personaEntity = new PersonaEntity();

		if (personaDTO.getIdPersona() != null) {
			personaEntity.setIdPersona(personaDTO.getIdPersona());
		}

		personaEntity.setTipoDocumento(personaDTO.getTipoDocumento());
		personaEntity.setNumDocumento(personaDTO.getNumDocumento());
		personaEntity.setNombres(personaDTO.getNombres());
		personaEntity.setApellidos(personaDTO.getApellidos());
		personaEntity.setSexo(personaDTO.getSexo());
		personaEntity
				.setFirmaDigital(personaDTO.getFirmaDigital() != null ? personaDTO.getFirmaDigital().getBytes() : null);
		personaEntity.setFoto(personaDTO.getFoto() != null ? personaDTO.getFoto().getBytes() : null);
		personaEntity.setFechaNacimiento(personaDTO.getFechaNacimiento());
		personaEntity.setEstatura(personaDTO.getEstatura());
		personaEntity.setPeso(personaDTO.getPeso());
		personaEntity.setTipoRh(personaDTO.getTipoRh());
		personaEntity.setEstadoPersona(personaDTO.getEstadoPersona() != null ? personaDTO.getEstadoPersona() : VL);

		return personaEntity;
	}

	/**
	 * 
	 * @param ContactoEntity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetContacto(ContactoEntity entity) {
		return service.insertUpdatetContacto(entity);
	}

	/**
	 * 
	 * @param ContactoDTO
	 * @return ContactoEntity
	 */
	public ContactoEntity maperContactoDTOToEntity(ContactoDTO contactoDTO) {
		ContactoEntity contactoEntity = new ContactoEntity();

		if (contactoDTO.getIdContacto() != null) {
			contactoEntity.setIdContacto(contactoDTO.getIdContacto());
		}
		contactoEntity.setIdPersona(contactoDTO.getIdPersona());
		contactoEntity.setTipocontacto(contactoDTO.getTipocontacto());
		contactoEntity.setValor(contactoDTO.getValor());
		contactoEntity
				.setEstadoContacto(contactoDTO.getEstadoContacto() != null ? contactoDTO.getEstadoContacto() : VL);

		return contactoEntity;

	}

	/**
	 * 
	 * @param MotoEntity
	 * @return StatusResponse
	 */
	public ResponseMotoEntity insertUpdatetMoto(MotoEntity entity) {
		return service.insertUpdatetMoto(entity);
	}

	/**
	 * 
	 * @param MotoDTO
	 * @return MotoEntity
	 */
	public MotoEntity maperMotoDTOToEntity(MotoDTO motoDTO) {
		MotoEntity motoEntity = new MotoEntity();

		if (motoDTO.getIdMoto() != null) {
			motoEntity.setIdMoto(motoDTO.getIdMoto());
		}
		motoEntity.setIdPersona(motoDTO.getIdPersona());
		motoEntity.setReferencia(motoDTO.getReferencia());
		motoEntity.setClase(motoDTO.getClase());
		motoEntity.setMarca(motoDTO.getMarca());
		motoEntity.setCleidcilindraje(motoDTO.getCleidcilindraje());
		motoEntity.setModelo(motoDTO.getModelo());
		motoEntity.setPlaca(motoDTO.getPlaca());
		motoEntity.setCombustilbe(motoDTO.getCombustilbe());
		motoEntity.setNumMotor(motoDTO.getNumMotor());
		motoEntity.setNumChasis(motoDTO.getNumChasis());
		motoEntity.setVin(motoDTO.getVin());
		motoEntity.setLinea(motoDTO.getLinea());
		motoEntity.setColor(motoDTO.getColor());
		motoEntity.setPeso(motoDTO.getPeso());
		motoEntity.setEstadoMoto(motoDTO.getEstadoMoto() != null ? motoDTO.getEstadoMoto() : VL);

		return motoEntity;

	}

	/**
	 * 
	 * @param ControlEstadoMotoEntity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetControlEstadoMoto(ControlEstadoMotoEntity entity) {
		return service.insertUpdatetControlEstadoMoto(entity);
	}

	/**
	 * 
	 * @param ControlEstadoMotoDTO
	 * @return ControlEstadoMotoEntity
	 */
	public ControlEstadoMotoEntity maperControlEstadoMotoDTOToEntity(ControlEstadoMotoDTO controlDTO) {
		ControlEstadoMotoEntity entity = new ControlEstadoMotoEntity();

		if (controlDTO.getIdControlMoto() != null) {
			entity.setIdControlMoto(controlDTO.getIdControlMoto());
		}
		entity.setIdMoto(controlDTO.getIdMoto());
		entity.setKilometraje(controlDTO.getKilometraje());
		Date date = new Date();
		Timestamp timestamp2 = new Timestamp(date.getTime());
		entity.setFecha(timestamp2);
		entity.setKilometrajemantenimieto(
				controlDTO.getKilometrajemantenimieto() != null ? controlDTO.getKilometrajemantenimieto() : KL);
		entity.setEstadoControlMoto(controlDTO.getEstadoControlMoto() != null ? controlDTO.getEstadoControlMoto() : VL);

		return entity;

	}

	/**
	 * 
	 * @param KilometrajenotificacionEntity
	 * @return StatusResponse
	 */
	public ResponseKilometrajenotificacion insertUpdatetKilometrajenotificacion(KilometrajenotificacionEntity entity) {
		return service.insertUpdatetKilometrajenotificacion(entity);
	}

	/**
	 * 
	 * @param KilometrajenotificacionDTO
	 * @return KilometrajenotificacionEntity
	 */
	public KilometrajenotificacionEntity maperKilometrajenotificacionDTOToEntity(KilometrajenotificacionDTO kilNotDTO) {
		KilometrajenotificacionEntity entity = new KilometrajenotificacionEntity();

		if (kilNotDTO.getKnidkilometrajenoti() != null) {
			entity.setKnidkilometrajenoti(kilNotDTO.getKnidkilometrajenoti());
		}
		Timestamp timestamp2 = new Timestamp(new Date().getTime());
		entity.setNtfecha(timestamp2);
		entity.setMtidmoto(kilNotDTO.getMtidmoto());
		entity.setEvtidevento(kilNotDTO.getEvtidevento());
		entity.setKilometrajevalidador(kilNotDTO.getKilometrajevalidador());
		entity.setKntkilometraje(kilNotDTO.getKntkilometraje());
		entity.setNtduracion(kilNotDTO.getNtduracion());
		entity.setNtnumrepeticion(kilNotDTO.getNtnumrepeticion());
		entity.setNttiemporepeticion(kilNotDTO.getNttiemporepeticion());
		entity.setStidestado(kilNotDTO.getStidestado() != null ? kilNotDTO.getStidestado() : VL);

		return entity;
	}

}
