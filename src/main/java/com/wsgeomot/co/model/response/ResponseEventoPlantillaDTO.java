/**
 * 
 */
package com.wsgeomot.co.model.response;

import java.util.List;

import com.wsgeomot.co.model.dto.EventoDTO;
import com.wsgeomot.co.model.dto.PlantillaDTO;
import com.wsgeomot.co.model.dto.StatusResponse;

/**
 * @author Andres Capera
 *
 */
public class ResponseEventoPlantillaDTO {
	private List<EventoDTO> eventoLista;
	private List<PlantillaDTO> plantillaLista;
	private StatusResponse statusResponse;

	/**
	 * @return the eventoLista
	 */
	public List<EventoDTO> getEventoLista() {
		return eventoLista;
	}

	/**
	 * @param eventoLista the eventoLista to set
	 */
	public void setEventoLista(List<EventoDTO> eventoLista) {
		this.eventoLista = eventoLista;
	}

	/**
	 * @return the plantillaLista
	 */
	public List<PlantillaDTO> getPlantillaLista() {
		return plantillaLista;
	}

	/**
	 * @param plantillaLista the plantillaLista to set
	 */
	public void setPlantillaLista(List<PlantillaDTO> plantillaLista) {
		this.plantillaLista = plantillaLista;
	}

	/**
	 * @return the statusResponse
	 */
	public StatusResponse getStatusResponse() {
		return statusResponse;
	}

	/**
	 * @param statusResponse the statusResponse to set
	 */
	public void setStatusResponse(StatusResponse statusResponse) {
		this.statusResponse = statusResponse;
	}

}
