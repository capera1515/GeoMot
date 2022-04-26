/**
 * 
 */
package com.wsgeomot.co.model.dto;

import java.util.Date;

/**
 * @author Andres Capera
 *
 */

public class EstadoRegistroDTO {

	private Integer idEstadoRegistro;
	private String siglas;
	private String descripcin;
	private Date fechaRegistro;
	private Integer estadoContacto;

	/**
	 * @return the idEstadoRegistro
	 */
	public Integer getIdEstadoRegistro() {
		return idEstadoRegistro;
	}

	/**
	 * @param idEstadoRegistro the idEstadoRegistro to set
	 */
	public void setIdEstadoRegistro(Integer idEstadoRegistro) {
		this.idEstadoRegistro = idEstadoRegistro;
	}

	/**
	 * @return the siglas
	 */
	public String getSiglas() {
		return siglas;
	}

	/**
	 * @param siglas the siglas to set
	 */
	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	/**
	 * @return the descripcin
	 */
	public String getDescripcin() {
		return descripcin;
	}

	/**
	 * @param descripcin the descripcin to set
	 */
	public void setDescripcin(String descripcin) {
		this.descripcin = descripcin;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
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
