package com.wsgeomot.co.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
import com.wsgeomot.co.service.GeoMotService;

@CrossOrigin
@RestController
@RequestMapping(value = "v1/")
public class GeoMotController {

	@Autowired
	GeoMotService service;

	/**
	 * METODO DE CONSULTA DE INFORMACION GENERAL PERSONA MOTO
	 * 
	 * @param tipoDocumento
	 * @param numDocumento
	 * @param placa
	 * @return RequesInfoGeneral
	 */
	@GetMapping("/info-persona-moto")
	public RequesInfoGeneral getInfoMotoPersona(@RequestParam(value = "", required = true) Integer tipoDocumento,
			@RequestParam(value = "", required = true) String numDocumento,
			@RequestParam(value = "", required = true) String placa) {
		return service.getInfoMotoPersona(tipoDocumento, numDocumento, placa);
	}

	/**
	 * METODO DE CONSULTA DE LISTAS MAESTRAS
	 * 
	 * @param tipoDocumento
	 * @param numDocumento
	 * @param placa
	 * @return ResponseMaestraLista
	 */
	@GetMapping("/listas-maestras")
	public ResponseMaestraLista getInfoListasMaestras(@RequestParam(value = "", required = true) String tipoDato) {
		return service.getInfoListasMaestras(tipoDato);
	}

	/**
	 * METODO DE CONSULTA DE EVENTOS Y PLANTILLAS
	 * 
	 * @param idEvento
	 * @returnResponseEventoPlantillaDTO
	 */
	@GetMapping("/eventos-plantillas")
	public ResponseEventoPlantillaDTO getEventoPlantilla(@RequestParam(value = "", required = false) Integer idEvento) {
		return service.getEventoPlantilla(idEvento);
	}

	/**
	 * METODO DE REGISTRO DE PERSONA Y CONTACTO
	 * 
	 * @param persoContacRequest
	 * @return ResponseContactoGL
	 */
	@PostMapping(path = "/persona-contacto")
	@ResponseBody
	public ResponseContactoGL insertUpdatePersonaContactoDTO(@RequestBody PersonaContactoRequest persoContacRequest) {
		return service.insertUpdatePersonaContactoDTO(persoContacRequest);
	}

	/**
	 * METODO DE RESGISTRO O ACTUALIZACION DE PERSONA
	 * 
	 * @param persona
	 * @return insertUpdatePersonaDTO
	 */
	@PostMapping(path = "/persona")
	@ResponseBody
	public ResponsePersonaEntity insertUpdatePersonaDTO(@RequestBody PersonaDTO persona) {
		return service.insertUpdatePersonaDTO(persona);
	}

	/**
	 * METODO DE REGISTRO O ACTUALIZACION CONTACTO DE PERSONA
	 * 
	 * @param contacto
	 * @return StatusResponse
	 */
	@PostMapping(path = "/contacto")
	@ResponseBody
	public StatusResponse insertUpdateContactoDTO(@RequestBody ContactoDTO contacto) {
		return service.insertUpdateContactoDTO(contacto);
	}

	/**
	 * METODO DE REGISTRO O ACTUALIZACION DE MOTO
	 * 
	 * @param motoDTO
	 * @return StatusResponse
	 */
	@PostMapping(path = "/moto")
	@ResponseBody
	public ResponseMotoEntity insertUpdateMotoDTO(@RequestBody MotoDTO moto) {
		return service.insertUpdateMotoDTO(moto);
	}

	/**
	 * METODO DE REGISTRO O ACTUALIZACION DE ESTADO KILOMETRAJE MOTO
	 * 
	 * @param controlEstadoMoto
	 * @return StatusResponse
	 */
	@PostMapping(path = "/control-estado-moto")
	@ResponseBody
	public StatusResponse insertUpdateContEstadoMotoDTO(@RequestBody ControlEstadoMotoDTO controlEstadoMoto) {
		return service.insertUpdateContEstadoMotoDTO(controlEstadoMoto);
	}

	/**
	 * METODO DE REGISTRO DE KILOMETRAJE DE NOTIFICACION DE MOTO
	 * 
	 * @param kilometrajenotificacion
	 * @return StatusResponse
	 */
	@PostMapping(path = "/kilometraje-notificacion-moto")
	@ResponseBody
	public ResponseKilometrajenotificacion insertUpdateKilometrajenotificacionDTO(
			@RequestBody KilometrajenotificacionDTO kilometrajenotificacion) {
		return service.insertUpdateKilometrajenotificacionDTO(kilometrajenotificacion);
	}

}
