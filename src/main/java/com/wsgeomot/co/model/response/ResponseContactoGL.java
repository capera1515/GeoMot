/**
 * 
 */
package com.wsgeomot.co.model.response;

import java.util.List;

import com.wsgeomot.co.model.dto.StatusResponse;

/**
 * @author Andres Capera
 *
 */
public class ResponseContactoGL {
	private List<ResponseContacto> responseContacto;
	private StatusResponse statusResponse;

	/**
	 * @return the responseContacto
	 */
	public List<ResponseContacto> getResponseContacto() {
		return responseContacto;
	}

	/**
	 * @param responseContacto the responseContacto to set
	 */
	public void setResponseContacto(List<ResponseContacto> responseContacto) {
		this.responseContacto = responseContacto;
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
