/**
 * 
 */
package com.wsgeomot.co.model.response;

import java.util.List;

import com.wsgeomot.co.model.dto.Maestra;
import com.wsgeomot.co.model.dto.StatusResponse;

/**
 * @author Andres Capera
 *
 */
public class ResponseMaestraLista {
	private List<Maestra> listaMaestraDTO;
	private StatusResponse statusResponse;

	/**
	 * @return the listaMaestraDTO
	 */
	public List<Maestra> getListaMaestraDTO() {
		return listaMaestraDTO;
	}

	/**
	 * @param listaMaestraDTO the listaMaestraDTO to set
	 */
	public void setListaMaestraDTO(List<Maestra> listaMaestraDTO) {
		this.listaMaestraDTO = listaMaestraDTO;
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
