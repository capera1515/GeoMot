/**
 * 
 */
package com.wsgeomot.co.model.response;

import java.util.List;

import com.wsgeomot.co.model.dto.ContactoDTO;
import com.wsgeomot.co.model.dto.StatusResponse;

/**
 * @author Andres Capera
 *
 */
public class ResponseValContacto {

	private StatusResponse statusResponse;
	private List<ContactoDTO> contacto;

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

	/**
	 * @return the contacto
	 */
	public List<ContactoDTO> getContacto() {
		return contacto;
	}

	/**
	 * @param contacto the contacto to set
	 */
	public void setContacto(List<ContactoDTO> contacto) {
		this.contacto = contacto;
	}

}
