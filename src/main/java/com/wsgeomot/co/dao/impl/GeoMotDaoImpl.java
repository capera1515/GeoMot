/**
 * 
 */
package com.wsgeomot.co.dao.impl;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Types;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.internal.SessionImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wsgeomot.co.dao.GeoMotDao;
import com.wsgeomot.co.model.dto.RequesInfoGeneral;
import com.wsgeomot.co.model.dto.StatusResponse;
import com.wsgeomot.co.model.entity.ContactoEntity;
import com.wsgeomot.co.model.entity.ControlEstadoMotoEntity;
import com.wsgeomot.co.model.entity.KilometrajenotificacionEntity;
import com.wsgeomot.co.model.entity.MotoEntity;
import com.wsgeomot.co.model.entity.PersonaEntity;
import com.wsgeomot.co.model.response.ResponseEventoPlantillaDTO;
import com.wsgeomot.co.model.response.ResponseKilometrajenotificacion;
import com.wsgeomot.co.model.response.ResponseMaestraLista;
import com.wsgeomot.co.model.response.ResponseMotoEntity;
import com.wsgeomot.co.model.response.ResponsePersonaEntity;
import com.wsgeomot.co.respository.ContactoRepository;
import com.wsgeomot.co.respository.ControlEstadoMotoRepository;
import com.wsgeomot.co.respository.KilometrajenotificacionRepository;
import com.wsgeomot.co.respository.MotoRepository;
import com.wsgeomot.co.respository.PersonaRepository;
import com.wsgeomot.util.ResponseCodes;

/**
 * @author Andres Capera
 *
 */
@Repository
@Transactional
public class GeoMotDaoImpl implements GeoMotDao {

	private static final Logger logger = Logger.getLogger(GeoMotDaoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	@Resource
	PersonaRepository personaRepository;

	@Resource
	ContactoRepository contactoRepository;

	@Resource
	MotoRepository motoRepository;

	@Resource
	ControlEstadoMotoRepository controlEstadoMotoRepository;

	@Resource
	KilometrajenotificacionRepository kilometrajenotificacionRepository;

	/**
	 * METODO DE CONSULTA DE INFORMACION GENERAL PERSONA MOTO
	 * 
	 * @param tipoDocumento
	 * @param numDocumento
	 * @param placa
	 * @return RequesInfoGeneral
	 */
	@SuppressWarnings("deprecation")
	public RequesInfoGeneral getInfoMotoPersona(Integer tipoDocumento, String numDocumento, String placa) {
		RequesInfoGeneral requesInfoGeneral = new RequesInfoGeneral();
		String hql = "{ CALL geomot.getInfoMotoPersona(?, ?, ?, ?)}";
		String out = "";
		ObjectMapper objectMapper = new ObjectMapper();
		try (CallableStatement callableStatement = ((SessionImpl) getSession().getSession()).connection()
				.prepareCall(hql)) {

			callableStatement.setInt(1, tipoDocumento);
			callableStatement.setString(2, numDocumento);
			callableStatement.setString(3, placa);
			callableStatement.registerOutParameter(4, Types.VARCHAR);
			callableStatement.execute();

			out = callableStatement.getString(4);
			if (out != null) {
				requesInfoGeneral = objectMapper.readValue(out, RequesInfoGeneral.class);
				requesInfoGeneral.setStatusResponse(ResponseCodes.SUCCESS);
			} else {
				requesInfoGeneral.setStatusResponse(ResponseCodes.NOT_FOUND);
			}
		} catch (SQLTimeoutException e) {
			String message = "getInfoMotoPersona SQLTimeoutException" + e.getMessage();
			requesInfoGeneral.setStatusResponse(ResponseCodes.TIMEOUT_EXCEPTION);
			logger.error(message);
		} catch (SQLException sql) {
			String message = "getInfoMotoPersona SQLException" + sql.getMessage();
			requesInfoGeneral.setStatusResponse(ResponseCodes.DATABASE_EXCEPTION);
			logger.error(message);
		} catch (Exception e) {
			requesInfoGeneral.setStatusResponse(ResponseCodes.TECHNICAL_ERROR);
			String message = "getInfoMotoPersona" + e.getMessage() + e.getCause();
			logger.error(message);

		}

		return requesInfoGeneral;

	}

	/**
	 * METODO DE CONSULTA DE LISTAS MAESTRAS
	 * 
	 * @param tipoDocumento
	 * @param numDocumento
	 * @param placa
	 * @return ResponseMaestraLista
	 */
	@SuppressWarnings("deprecation")
	public ResponseMaestraLista getInfoListasMaestras(String tipoDato) {
		ResponseMaestraLista requesInfoGeneral = new ResponseMaestraLista();
		String hql = "{ CALL geomot.listasMaestras(?, ?)}";
		String out = "";
		ObjectMapper objectMapper = new ObjectMapper();
		try (CallableStatement callableStatement = ((SessionImpl) getSession().getSession()).connection()
				.prepareCall(hql)) {

			callableStatement.setString(1, tipoDato);
			callableStatement.registerOutParameter(2, Types.VARCHAR);
			callableStatement.execute();

			out = callableStatement.getString(2);
			if (out != null) {
				requesInfoGeneral = objectMapper.readValue(out, ResponseMaestraLista.class);
				requesInfoGeneral.setStatusResponse(ResponseCodes.SUCCESS);
			} else {
				requesInfoGeneral.setStatusResponse(ResponseCodes.NOT_FOUND);
			}
		} catch (SQLTimeoutException e) {
			String message = "getInfoListasMaestras SQLTimeoutException" + e.getMessage();
			requesInfoGeneral.setStatusResponse(ResponseCodes.TIMEOUT_EXCEPTION);
			logger.error(message);
		} catch (SQLException sql) {
			String message = "getInfoListasMaestras SQLException" + sql.getMessage();
			requesInfoGeneral.setStatusResponse(ResponseCodes.DATABASE_EXCEPTION);
			logger.error(message);
		} catch (Exception e) {
			requesInfoGeneral.setStatusResponse(ResponseCodes.TECHNICAL_ERROR);
			String message = "getInfoListasMaestras" + e.getMessage() + e.getCause();
			logger.error(message);

		}

		return requesInfoGeneral;

	}

	/**
	 * METODO DE CONSULTA DE EVENTOS Y PLANTILLAS
	 * 
	 * @param idEvento
	 * @returnResponseEventoPlantillaDTO
	 */
	@SuppressWarnings("deprecation")
	public ResponseEventoPlantillaDTO getEventoPlantilla(Integer idEvento) {
		ResponseEventoPlantillaDTO requesInfoGeneral = new ResponseEventoPlantillaDTO();
		String hql = "{ CALL geomot.getEventoPlantilla(?, ?)}";
		String out = "";
		ObjectMapper objectMapper = new ObjectMapper();
		try (CallableStatement callableStatement = ((SessionImpl) getSession().getSession()).connection()
				.prepareCall(hql)) {

			callableStatement.setInt(1, idEvento != null ? idEvento : 0);
			callableStatement.registerOutParameter(2, Types.VARCHAR);
			callableStatement.execute();

			out = callableStatement.getString(2);
			if (out != null) {
				requesInfoGeneral = objectMapper.readValue(out, ResponseEventoPlantillaDTO.class);
				requesInfoGeneral.setStatusResponse(ResponseCodes.SUCCESS);
			} else {
				requesInfoGeneral.setStatusResponse(ResponseCodes.NOT_FOUND);
			}
		} catch (SQLTimeoutException e) {
			String message = "getEventoPlantilla SQLTimeoutException" + e.getMessage();
			requesInfoGeneral.setStatusResponse(ResponseCodes.TIMEOUT_EXCEPTION);
			logger.error(message);
		} catch (SQLException sql) {
			String message = "getEventoPlantilla SQLException" + sql.getMessage();
			requesInfoGeneral.setStatusResponse(ResponseCodes.DATABASE_EXCEPTION);
			logger.error(message);
		} catch (Exception e) {
			requesInfoGeneral.setStatusResponse(ResponseCodes.TECHNICAL_ERROR);
			String message = "getEventoPlantilla" + e.getMessage() + e.getCause();
			logger.error(message);

		}

		return requesInfoGeneral;

	}

	/**
	 * METODO DE RESGISTRO O ACTUALIZACION DE PERSONA
	 * 
	 * @param entity
	 * @return StatusResponse
	 */
	public ResponsePersonaEntity insertUpdatetPersona(PersonaEntity entity) {
		ResponsePersonaEntity responsePersonaEntity = new ResponsePersonaEntity();
		try {
			personaRepository.save(entity);
			responsePersonaEntity.setPersonaEntity(entity);
			responsePersonaEntity.setStatusResponse(ResponseCodes.SUCCESS);
		} catch (Exception e) {
			responsePersonaEntity.setStatusResponse(ResponseCodes.DATABASE_EXCEPTION);
			String message = "GeoMotDaoImpl insertUpdatetPersona" + e.getMessage() + e.getCause();
			logger.error(message);

		}
		return responsePersonaEntity;
	}

	/**
	 * METODO DE REGISTRO O ACTUALIZACION CONTACTO DE PERSONA
	 * 
	 * @param ContactoEntity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetContacto(ContactoEntity entity) {
		StatusResponse statusResponse = null;
		try {
			contactoRepository.save(entity);
			statusResponse = ResponseCodes.SUCCESS;
		} catch (Exception e) {
			statusResponse = ResponseCodes.DATABASE_EXCEPTION;
			String message = "GeoMotDaoImpl insertUpdatetContacto" + e.getMessage() + e.getCause();
			logger.error(message);

		}
		return statusResponse;
	}

	/**
	 * METODO DE REGISTRO O ACTUALIZACION DE MOTO
	 * 
	 * @param MotoEntity
	 * @return StatusResponse
	 */
	public ResponseMotoEntity insertUpdatetMoto(MotoEntity entity) {
		ResponseMotoEntity responseMotoEntity = new ResponseMotoEntity();
		try {
			motoRepository.save(entity);
			responseMotoEntity.setStatusResponse(ResponseCodes.SUCCESS);
			responseMotoEntity.setMotoEntity(entity);
		} catch (Exception e) {
			responseMotoEntity.setStatusResponse(ResponseCodes.DATABASE_EXCEPTION);
			String message = "GeoMotDaoImpl insertUpdatetMoto" + e.getMessage() + e.getCause();
			logger.error(message);

		}
		return responseMotoEntity;
	}

	/**
	 * METODO DE REGISTRO O ACTUALIZACION DE ESTADO KILOMETRAJE MOTO
	 * 
	 * @param ControlEstadoMotoEntity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetControlEstadoMoto(ControlEstadoMotoEntity entity) {
		StatusResponse statusResponse = null;
		try {
			controlEstadoMotoRepository.save(entity);
			statusResponse = ResponseCodes.SUCCESS;
		} catch (Exception e) {
			statusResponse = ResponseCodes.DATABASE_EXCEPTION;
			String message = "GeoMotDaoImpl insertUpdatetControlEstadoMoto" + e.getMessage() + e.getCause();
			logger.error(message);

		}
		return statusResponse;
	}

	/**
	 * METODO DE REGISTRO DE KILOMETRAJE DE NOTIFICACION DE MOTO
	 * 
	 * @param KilometrajenotificacionEntity
	 * @return StatusResponse
	 */
	public ResponseKilometrajenotificacion insertUpdatetKilometrajenotificacion(KilometrajenotificacionEntity entity) {
		ResponseKilometrajenotificacion responseKilometrajenotificacion = new ResponseKilometrajenotificacion();
		try {
			kilometrajenotificacionRepository.save(entity);
			responseKilometrajenotificacion.setKilometrajenotificacionEntity(entity);
			responseKilometrajenotificacion.setStatusResponse(ResponseCodes.SUCCESS);
		} catch (Exception e) {
			responseKilometrajenotificacion.setStatusResponse(ResponseCodes.DATABASE_EXCEPTION);
			String message = "GeoMotDaoImpl insertUpdatetKilometrajenotificacion" + e.getMessage() + e.getCause();
			logger.error(message);

		}
		return responseKilometrajenotificacion;
	}

}
