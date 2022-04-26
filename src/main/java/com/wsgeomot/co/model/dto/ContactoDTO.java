package com.wsgeomot.co.model.dto;

public class ContactoDTO {

	private Integer idContacto;
	private Integer idPersona;
	private Integer tipocontacto;
	private String valor;
	private Integer estadoContacto;

	/**
	 * @return the idContacto
	 */
	public Integer getIdContacto() {
		return idContacto;
	}

	/**
	 * @param idContacto the idContacto to set
	 */
	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
	}

	/**
	 * @return the idPersona
	 */
	public Integer getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * @return the tipocontacto
	 */
	public Integer getTipocontacto() {
		return tipocontacto;
	}

	/**
	 * @param tipocontacto the tipocontacto to set
	 */
	public void setTipocontacto(Integer tipocontacto) {
		this.tipocontacto = tipocontacto;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * @return the estadoContacto
	 */
	public Integer getEstadoContacto() {
		return estadoContacto;
	}

	/**
	 * @param estadoContacto the estadoContacto to set
	 */
	public void setEstadoContacto(Integer estadoContacto) {
		this.estadoContacto = estadoContacto;
	}

}
