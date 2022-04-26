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
import com.wsgeomot.co.model.dto.NotificacionDTO;
import com.wsgeomot.co.model.dto.PersonaDTO;
import com.wsgeomot.co.model.dto.RequesInfoGeneral;
import com.wsgeomot.co.model.dto.StatusResponse;
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
	 * METODO DE RESGISTRO O ACTUALIZACION DE PERSONA
	 * 
	 * @param persona
	 * @return insertUpdatePersonaDTO
	 */
	@PostMapping(path = "/persona")
	@ResponseBody
	public StatusResponse insertUpdatePersonaDTO(@RequestBody PersonaDTO persona) {
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
	public StatusResponse insertUpdateMotoDTO(@RequestBody MotoDTO moto) {
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
	public StatusResponse insertUpdateKilometrajenotificacionDTO(
			@RequestBody KilometrajenotificacionDTO kilometrajenotificacion) {
		return service.insertUpdateKilometrajenotificacionDTO(kilometrajenotificacion);
	}

	/**
	 * METODO DE REGISTRO DE KILOMETRAJE DE NOTIFICACION DE MOTO
	 * 
	 * @param kilometrajenotificacion
	 * @return StatusResponse
	 */
	@PostMapping(path = "/notificacion-moto")
	@ResponseBody
	public StatusResponse insertUpdatetNotificacion(@RequestBody NotificacionDTO notificacionDTO) {
		return service.insertUpdatetNotificacion(notificacionDTO);
	}

}
