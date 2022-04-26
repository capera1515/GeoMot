/**
 * 
 */
package com.wsgeomot.co.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsgeomot.co.dao.GeoMotDao;
import com.wsgeomot.co.model.dto.ContactoDTO;
import com.wsgeomot.co.model.dto.ControlEstadoMotoDTO;
import com.wsgeomot.co.model.dto.KilometrajenotificacionDTO;
import com.wsgeomot.co.model.dto.MotoDTO;
import com.wsgeomot.co.model.dto.NotificacionDTO;
import com.wsgeomot.co.model.dto.PersonaDTO;
import com.wsgeomot.co.model.dto.RequesInfoGeneral;
import com.wsgeomot.co.model.dto.StatusResponse;
import com.wsgeomot.co.model.entity.ContactoEntity;
import com.wsgeomot.co.model.entity.ControlEstadoMotoEntity;
import com.wsgeomot.co.model.entity.KilometrajenotificacionEntity;
import com.wsgeomot.co.model.entity.MotoEntity;
import com.wsgeomot.co.model.entity.NotificacionEntity;
import com.wsgeomot.co.model.entity.PersonaEntity;
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
	 * METODO DE RESGISTRO O ACTUALIZACION DE PERSONA
	 * 
	 * @param PersonaDTO
	 * @return insertUpdatePersonaDTO
	 */
	public StatusResponse insertUpdatePersonaDTO(PersonaDTO persona) {
		StatusResponse statusResponse = ResponseCodes.SUCCESS;
		try {
			statusResponse = validateGeneral.validate(persona);
			if (statusResponse.getStatus().equals(ResponseCodes.SUCCESS.getStatus())) {
				statusResponse = insertUpdatetPersona(maperPersonaDTOToEntity(persona));
			}
		} catch (Exception e) {
			statusResponse = ResponseCodes.TECHNICAL_ERROR;
			String message = "GeoMotServiceImpl insertUpdateGeneral" + e.getMessage() + e.getCause();
			logger.error(message);
		}
		return statusResponse;

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
	 * METODO DE REGISTRO O ACTUALIZACION DE MOTO
	 * 
	 * @param MotoDTO
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdateMotoDTO(MotoDTO motoDTO) {
		StatusResponse statusResponse = ResponseCodes.SUCCESS;
		try {
			statusResponse = validateGeneral.validate(motoDTO);
			if (statusResponse.getStatus().equals(ResponseCodes.SUCCESS.getStatus())) {
				statusResponse = insertUpdatetMoto(maperMotoDTOToEntity(motoDTO));
			}
		} catch (Exception e) {
			statusResponse = ResponseCodes.TECHNICAL_ERROR;
			String message = "GeoMotServiceImpl insertUpdateMotoDTO" + e.getMessage() + e.getCause();
			logger.error(message);
		}
		return statusResponse;

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
	public StatusResponse insertUpdateKilometrajenotificacionDTO(KilometrajenotificacionDTO kilometrajenotificacion) {
		StatusResponse statusResponse = ResponseCodes.SUCCESS;
		try {
			statusResponse = validateGeneral.validate(kilometrajenotificacion);
			if (statusResponse.getStatus().equals(ResponseCodes.SUCCESS.getStatus())) {
				statusResponse = insertUpdatetKilometrajenotificacion(
						maperKilometrajenotificacionDTOToEntity(kilometrajenotificacion));
			}
		} catch (Exception e) {
			statusResponse = ResponseCodes.TECHNICAL_ERROR;
			String message = "GeoMotServiceImpl insertUpdateKilometrajenotificacionDTO" + e.getMessage() + e.getCause();
			logger.error(message);
		}
		return statusResponse;

	}

	/**
	 * METODO DE REGISTRO DE KILOMETRAJE DE NOTIFICACION DE MOTO
	 * 
	 * @param NotificacionDTO
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetNotificacion(NotificacionDTO notificacionDTO) {
		StatusResponse statusResponse = ResponseCodes.SUCCESS;
		try {
			statusResponse = validateGeneral.validate(notificacionDTO);
			if (statusResponse.getStatus().equals(ResponseCodes.SUCCESS.getStatus())) {
				statusResponse = insertUpdatetNotificacion(maperNotificacionDTOToEntity(notificacionDTO));
			}
		} catch (Exception e) {
			statusResponse = ResponseCodes.TECHNICAL_ERROR;
			String message = "GeoMotServiceImpl insertUpdatetNotificacion" + e.getMessage() + e.getCause();
			logger.error(message);
		}
		return statusResponse;

	}

	/**
	 * 
	 * @param PersonaEntity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetPersona(PersonaEntity entity) {
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
	public StatusResponse insertUpdatetMoto(MotoEntity entity) {
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
		entity.setEstadoControlMoto(controlDTO.getEstadoControlMoto() != null ? controlDTO.getEstadoControlMoto() : VL);

		return entity;

	}

	/**
	 * 
	 * @param KilometrajenotificacionEntity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetKilometrajenotificacion(KilometrajenotificacionEntity entity) {
		return service.insertUpdatetKilometrajenotificacion(entity);
	}

	/**
	 * 
	 * @param KilometrajenotificacionDTO
	 * @return KilometrajenotificacionEntity
	 */
	public KilometrajenotificacionEntity maperKilometrajenotificacionDTOToEntity(KilometrajenotificacionDTO kilNotDTO) {
		KilometrajenotificacionEntity entity = new KilometrajenotificacionEntity();

		if (kilNotDTO.getIdKilometrajeNoti() != null) {
			entity.setIdKilometrajeNoti(kilNotDTO.getIdKilometrajeNoti());
		}
		entity.setIdMoto(kilNotDTO.getIdMoto());
		entity.setIdEvento(kilNotDTO.getIdEvento());
		entity.setKilometrajeNoti(kilNotDTO.getKilometrajeNoti());
		entity.setEstadoKilometrajeNoti(
				kilNotDTO.getEstadoKilometrajeNoti() != null ? kilNotDTO.getEstadoKilometrajeNoti() : VL);

		return entity;
	}

	/**
	 * METODO DE REGISTRO DE KILOMETRAJE DE NOTIFICACION DE MOTO
	 * 
	 * @param kilometrajenotificacion
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetNotificacion(NotificacionEntity entity) {
		return service.insertUpdatetNotificacion(entity);
	}

	/**
	 * 
	 * @param NotificacionDTO
	 * @return NotificacionEntity
	 */
	public NotificacionEntity maperNotificacionDTOToEntity(NotificacionDTO notificacionDTO) {
		NotificacionEntity entity = new NotificacionEntity();

		if (notificacionDTO.getIdNotificacion() != null) {
			entity.setIdNotificacion(notificacionDTO.getIdNotificacion());
		}

		entity.setIdKilometrajeNoti(notificacionDTO.getIdKilometrajeNoti());
		entity.setIdPlantilla(notificacionDTO.getIdPlantilla());
		Date date = new Date();
		Timestamp timestamp2 = new Timestamp(date.getTime());
		entity.setFecha(timestamp2);
		entity.setDuracion(notificacionDTO.getDuracion());
		entity.setNumRepeticion(notificacionDTO.getNumRepeticion());
		entity.setTiempoRepeticion(notificacionDTO.getTiempoRepeticion());
		entity.setEstado(notificacionDTO.getEstado() != null ? notificacionDTO.getEstado() : VL);

		return entity;
	}
}
