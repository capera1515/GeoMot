/**
 * 
 */
package com.wsgeomot.co.model.response;

import com.wsgeomot.co.model.dto.StatusResponse;
import com.wsgeomot.co.model.entity.KilometrajenotificacionEntity;

/**
 * @author Andres Capera
 *
 */
public class ResponseKilometrajenotificacion {
	private KilometrajenotificacionEntity kilometrajenotificacionEntity;
	private StatusResponse statusResponse;

	/**
	 * @return the kilometrajenotificacionEntity
	 */
	public KilometrajenotificacionEntity getKilometrajenotificacionEntity() {
		return kilometrajenotificacionEntity;
	}

	/**
	 * @param kilometrajenotificacionEntity the kilometrajenotificacionEntity to set
	 */
	public void setKilometrajenotificacionEntity(KilometrajenotificacionEntity kilometrajenotificacionEntity) {
		this.kilometrajenotificacionEntity = kilometrajenotificacionEntity;
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
