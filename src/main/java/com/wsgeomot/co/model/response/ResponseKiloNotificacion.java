/**
 * 
 */
package com.wsgeomot.co.model.response;

import java.util.List;

import com.wsgeomot.co.model.dto.KilometrajenotificacionDTO;
import com.wsgeomot.co.model.dto.StatusResponse;

/**
 * @author Andres Capera
 *
 */
public class ResponseKiloNotificacion {
	private List<KilometrajenotificacionDTO> kilometrajenotificacion;
	private StatusResponse statusResponse;

	/**
	 * @return the kilometrajenotificacion
	 */
	public List<KilometrajenotificacionDTO> getKilometrajenotificacion() {
		return kilometrajenotificacion;
	}

	/**
	 * @param kilometrajenotificacion the kilometrajenotificacion to set
	 */
	public void setKilometrajenotificacion(List<KilometrajenotificacionDTO> kilometrajenotificacion) {
		this.kilometrajenotificacion = kilometrajenotificacion;
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
