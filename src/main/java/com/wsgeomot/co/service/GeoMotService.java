/**
 * 
 */
package com.wsgeomot.co.service;

import com.wsgeomot.co.model.dto.ContactoDTO;
import com.wsgeomot.co.model.dto.ControlEstadoMotoDTO;
import com.wsgeomot.co.model.dto.KilometrajenotificacionDTO;
import com.wsgeomot.co.model.dto.MotoDTO;
import com.wsgeomot.co.model.dto.PersonaContactoRequest;
import com.wsgeomot.co.model.dto.PersonaDTO;
import com.wsgeomot.co.model.dto.RequesInfoGeneral;
import com.wsgeomot.co.model.dto.StatusResponse;
import com.wsgeomot.co.model.response.ResponseContactoGL;
import com.wsgeomot.co.model.response.ResponseEventoPlantillaDTO;
import com.wsgeomot.co.model.response.ResponseKilometrajenotificacion;
import com.wsgeomot.co.model.response.ResponseMaestraLista;
import com.wsgeomot.co.model.response.ResponseMotoEntity;
import com.wsgeomot.co.model.response.ResponsePersonaEntity;

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
	 * METODO DE REGISTRO DE PERSONA Y CONTACTO
	 * 
	 * @param persoContacRequest
	 * @return ResponseContactoGL
	 */
	public ResponseContactoGL insertUpdatePersonaContactoDTO(PersonaContactoRequest persoContacRequest);

	/**
	 * METODO DE RESGISTRO O ACTUALIZACION DE PERSONA
	 * 
	 * @param persona
	 * @return insertUpdatePersonaDTO
	 */
	public ResponsePersonaEntity insertUpdatePersonaDTO(PersonaDTO persona);

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
	public ResponseMotoEntity insertUpdateMotoDTO(MotoDTO motoDTO);

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
	public ResponseKilometrajenotificacion insertUpdateKilometrajenotificacionDTO(
			KilometrajenotificacionDTO kilometrajenotificacion);

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
