/**
 * 
 */
package com.wsgeomot.co.model.response;

import com.wsgeomot.co.model.dto.ContactoDTO;
import com.wsgeomot.co.model.dto.ControlEstadoMotoDTO;
import com.wsgeomot.co.model.dto.KilometrajenotificacionDTO;
import com.wsgeomot.co.model.dto.MotoDTO;
import com.wsgeomot.co.model.dto.PersonaDTO;

/**
 * @author Andres Capera
 *
 */
public class ResponseInfoGeneral {

	private PersonaDTO persona;
	private ContactoDTO contacto;
	private MotoDTO moto;
	private ControlEstadoMotoDTO controlEstadoMoto;
	private KilometrajenotificacionDTO kilometrajenotificacion;

	/**
	 * @return the persona
	 */
	public PersonaDTO getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(PersonaDTO persona) {
		this.persona = persona;
	}

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
	 * @return the moto
	 */
	public MotoDTO getMoto() {
		return moto;
	}

	/**
	 * @param moto the moto to set
	 */
	public void setMoto(MotoDTO moto) {
		this.moto = moto;
	}

	/**
	 * @return the controlEstadoMoto
	 */
	public ControlEstadoMotoDTO getControlEstadoMoto() {
		return controlEstadoMoto;
	}

	/**
	 * @param controlEstadoMoto the controlEstadoMoto to set
	 */
	public void setControlEstadoMoto(ControlEstadoMotoDTO controlEstadoMoto) {
		this.controlEstadoMoto = controlEstadoMoto;
	}

	/**
	 * @return the kilometrajenotificacion
	 */
	public KilometrajenotificacionDTO getKilometrajenotificacion() {
		return kilometrajenotificacion;
	}

	/**
	 * @param kilometrajenotificacion the kilometrajenotificacion to set
	 */
	public void setKilometrajenotificacion(KilometrajenotificacionDTO kilometrajenotificacion) {
		this.kilometrajenotificacion = kilometrajenotificacion;
	}

}
