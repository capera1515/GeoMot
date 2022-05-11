/**
 * 
 */
package com.wsgeomot.co.model.response;

import com.wsgeomot.co.model.dto.StatusResponse;
import com.wsgeomot.co.model.entity.PersonaEntity;

/**
 * @author Andres Capera
 *
 */
public class ResponsePersonaEntity {
	private PersonaEntity personaEntity;
	private StatusResponse statusResponse;

	/**
	 * @return the personaEntity
	 */
	public PersonaEntity getPersonaEntity() {
		return personaEntity;
	}

	/**
	 * @param personaEntity the personaEntity to set
	 */
	public void setPersonaEntity(PersonaEntity personaEntity) {
		this.personaEntity = personaEntity;
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
