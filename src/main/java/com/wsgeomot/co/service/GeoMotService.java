/**
 * 
 */
package com.wsgeomot.co.service;

import com.wsgeomot.co.model.dto.ContactoDTO;
import com.wsgeomot.co.model.dto.ControlEstadoMotoDTO;
import com.wsgeomot.co.model.dto.KilometrajenotificacionDTO;
import com.wsgeomot.co.model.dto.MotoDTO;
import com.wsgeomot.co.model.dto.NotificacionDTO;
import com.wsgeomot.co.model.dto.PersonaDTO;
import com.wsgeomot.co.model.dto.RequesInfoGeneral;
import com.wsgeomot.co.model.dto.StatusResponse;

/**
 * @author Andres Capera
 *
 */
public interface GeoMotService {

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
	 * @param persona
	 * @return insertUpdatePersonaDTO
	 */
	public StatusResponse insertUpdatePersonaDTO(PersonaDTO persona);

	/**
	 * METODO DE REGISTRO O ACTUALIZACION CONTACTO DE PERSONA
	 * 
	 * @param contacto
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdateContactoDTO(ContactoDTO contacto);

	/**
	 * METODO DE REGISTRO O ACTUALIZACION DE MOTO
	 * 
	 * @param motoDTO
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdateMotoDTO(MotoDTO motoDTO);

	/**
	 * METODO DE REGISTRO O ACTUALIZACION DE ESTADO KILOMETRAJE MOTO
	 * 
	 * @param controlEstadoMoto
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdateContEstadoMotoDTO(ControlEstadoMotoDTO controlEstadoMoto);

	/**
	 * METODO DE REGISTRO DE KILOMETRAJE DE NOTIFICACION DE MOTO
	 * 
	 * @param kilometrajenotificacion
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdateKilometrajenotificacionDTO(KilometrajenotificacionDTO kilometrajenotificacion);

	/**
	 * METODO DE REGISTRO DE KILOMETRAJE DE NOTIFICACION DE MOTO
	 * 
	 * @param kilometrajenotificacion
	 * @return StatusResponse
	 */
	public StatusResponse insertUpdatetNotificacion(NotificacionDTO notificacionDTO);

}
