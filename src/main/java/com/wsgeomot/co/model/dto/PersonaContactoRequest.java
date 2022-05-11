/**
 * 
 */
package com.wsgeomot.co.model.dto;

import java.util.List;

/**
 * @author Andres Capera
 *
 */
public class PersonaContactoRequest {
	private PersonaDTO personaDTO;
	private List<ContactoDTO> contactoDTOList;

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

}
