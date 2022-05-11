/**
 * 
 */
package com.wsgeomot.co.model.response;

import com.wsgeomot.co.model.dto.StatusResponse;
import com.wsgeomot.co.model.entity.MotoEntity;

/**
 * @author Andres Capera
 *
 */
public class ResponseMotoEntity {
	private MotoEntity motoEntity;
	private StatusResponse statusResponse;

	/**
	 * @return the motoEntity
	 */
	public MotoEntity getMotoEntity() {
		return motoEntity;
	}

	/**
	 * @param motoEntity the motoEntity to set
	 */
	public void setMotoEntity(MotoEntity motoEntity) {
		this.motoEntity = motoEntity;
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
