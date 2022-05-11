/**
 * 
 */
package com.wsgeomot.co.model.response;

import java.util.List;

import com.wsgeomot.co.model.dto.ContactoDTO;
import com.wsgeomot.co.model.dto.KilometrajenotificacionDTO;
import com.wsgeomot.co.model.dto.MotoDTO;
import com.wsgeomot.co.model.dto.PersonaDTO;
import com.wsgeomot.co.model.dto.StatusResponse;

/**
 * @author Andres Capera
 *
 */
public class ResponseInfoGeneral {

	private PersonaDTO personaDTO;
	private List<ContactoDTO> contactoDTOList;
	private MotoDTO motoDTO;
	private List<KilometrajenotificacionDTO> kilometrajenotificacionDTOList;
	private StatusResponse statusResponse;

	/**
	 * @return the personaDTO
	 */
	public PersonaDTO getPersonaDTO() {
		return personaDTO;
	}

	/**
	 * @param personaDTO the personaDTO to set
	 */
	public void setPersonaDTO(PersonaDTO personaDTO) {
		this.personaDTO = personaDTO;
	}

	/**
	 * @return the contactoDTOList
	 */
	public List<ContactoDTO> getContactoDTOList() {
		return contactoDTOList;
	}

	/**
	 * @param contactoDTOList the contactoDTOList to set
	 */
	public void setContactoDTOList(List<ContactoDTO> contactoDTOList) {
		this.contactoDTOList = contactoDTOList;
	}

	/**
	 * @return the motoDTO
	 */
	public MotoDTO getMotoDTO() {
		return motoDTO;
	}

	/**
	 * @param motoDTO the motoDTO to set
	 */
	public void setMotoDTO(MotoDTO motoDTO) {
		this.motoDTO = motoDTO;
	}


	/**
	 * @return the kilometrajenotificacionDTOList
	 */
	public List<KilometrajenotificacionDTO> getKilometrajenotificacionDTOList() {
		return kilometrajenotificacionDTOList;
	}

	/**
	 * @param kilometrajenotificacionDTOList the kilometrajenotificacionDTOList to
	 *                                       set
	 */
	public void setKilometrajenotificacionDTOList(List<KilometrajenotificacionDTO> kilometrajenotificacionDTOList) {
		this.kilometrajenotificacionDTOList = kilometrajenotificacionDTOList;
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
