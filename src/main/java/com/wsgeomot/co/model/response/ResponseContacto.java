/**
 * 
 */
package com.wsgeomot.co.model.response;

import com.wsgeomot.co.model.dto.ContactoDTO;
import com.wsgeomot.co.model.dto.StatusResponse;

/**
 * @author Andres Capera
 *
 */
public class ResponseContacto {
	ContactoDTO contacto;
	private StatusResponse statusResponse;

	/**
	 * @return the contacto
	 */
	public ContactoDTO getContacto() {
		return contacto;
	}

	/**
	 * @param contacto the contacto to set
	 */
	public void setContacto(ContactoDTO contacto) {
		this.contacto = contacto;
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
