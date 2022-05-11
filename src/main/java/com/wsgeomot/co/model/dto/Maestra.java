/**
 * 
 */
package com.wsgeomot.co.model.dto;

/**
 * @author Andres Capera
 *
 */
public class Maestra {

	private Integer id;
	private String siglas;
	private String descripcin;
	private String fechaRegistro;
	private Integer estadoCombustible;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	public String getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the estadoCombustible
	 */
	public Integer getEstadoCombustible() {
		return estadoCombustible;
	}

	/**
	 * @param estadoCombustible the estadoCombustible to set
	 */
	public void setEstadoCombustible(Integer estadoCombustible) {
		this.estadoCombustible = estadoCombustible;
	}

}
