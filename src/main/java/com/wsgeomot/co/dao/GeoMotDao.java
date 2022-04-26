/**
 * 
 */
package com.wsgeomot.co.dao;

import com.wsgeomot.co.model.dto.RequesInfoGeneral;
import com.wsgeomot.co.model.dto.StatusResponse;
import com.wsgeomot.co.model.entity.ContactoEntity;
import com.wsgeomot.co.model.entity.ControlEstadoMotoEntity;
import com.wsgeomot.co.model.entity.KilometrajenotificacionEntity;
import com.wsgeomot.co.model.entity.MotoEntity;
import com.wsgeomot.co.model.entity.NotificacionEntity;
import com.wsgeomot.co.model.entity.PersonaEntity;

/**
 * @author Andres Capera
 *
 */
public interface GeoMotDao {

	/**
	 * METODO DE CONSULTA DE INFORMACION GENERAL PERSONA MOTO
	 * 
	 * @param tipoDocumento
	 * @param numDocumento
	 * @param placa
	 * @return RequesInfoGeneral
	 */
	public RequesInfoGeneral getInfoMotoPersona(Integer tipoDocumento, String numDocumento, String placa);

	/**
	 * METODO DE RESGISTRO O ACTUALIZACION DE PERSONA
	 * 
	 * @param entity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetPersona(PersonaEntity entity);

	/**
	 * METODO DE REGISTRO O ACTUALIZACION CONTACTO DE PERSONA
	 * 
	 * @param ContactoEntity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetContacto(ContactoEntity entity);

	/**
	 * METODO DE REGISTRO O ACTUALIZACION DE MOTO
	 * 
	 * @param MotoEntity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetMoto(MotoEntity entity);

	/**
	 * METODO DE REGISTRO O ACTUALIZACION DE ESTADO KILOMETRAJE MOTO
	 * 
	 * @param ControlEstadoMotoEntity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetControlEstadoMoto(ControlEstadoMotoEntity entity);

	/**
	 * METODO DE REGISTRO DE KILOMETRAJE DE NOTIFICACION DE MOTO
	 * 
	 * @param KilometrajenotificacionEntity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetKilometrajenotificacion(KilometrajenotificacionEntity entity);

	/**
	 * METODO DE REGISTRODE NOTIFICACION
	 * 
	 * @param NotificacionEntity
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetNotificacion(NotificacionEntity entity);

}
