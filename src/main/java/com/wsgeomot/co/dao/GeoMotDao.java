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
import com.wsgeomot.co.model.entity.PersonaEntity;
import com.wsgeomot.co.model.response.ResponseEventoPlantillaDTO;
import com.wsgeomot.co.model.response.ResponseKilometrajenotificacion;
import com.wsgeomot.co.model.response.ResponseMaestraLista;
import com.wsgeomot.co.model.response.ResponseMotoEntity;
import com.wsgeomot.co.model.response.ResponsePersonaEntity;

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
	public ResponsePersonaEntity insertUpdatetPersona(PersonaEntity entity);

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
	public ResponseMotoEntity insertUpdatetMoto(MotoEntity entity);

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
	public ResponseKilometrajenotificacion insertUpdatetKilometrajenotificacion(KilometrajenotificacionEntity entity);


	/**
	 * METODO DE CONSULTA DE LISTAS MAESTRAS
	 * 
	 * @param tipoDocumento
	 * @param numDocumento
	 * @param placa
	 * @return ResponseMaestraLista
	 */
	public ResponseMaestraLista getInfoListasMaestras(String tipoDato);
	
	
	/**
	 * METODO DE CONSULTA DE EVENTOS Y PLANTILLAS
	 * 
	 * @param idEvento
	 * @returnResponseEventoPlantillaDTO
	 */
	public ResponseEventoPlantillaDTO getEventoPlantilla(Integer idEvento);

}
