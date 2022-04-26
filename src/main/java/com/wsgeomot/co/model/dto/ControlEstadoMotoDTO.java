package com.wsgeomot.co.model.dto;

public class ControlEstadoMotoDTO {

	private Integer idControlMoto;
	private Integer idMoto;
	private String fecha;
	private Double kilometraje;
	private Integer estadoControlMoto;

	/**
	 * @return the idControlMoto
	 */
	public Integer getIdControlMoto() {
		return idControlMoto;
	}

	/**
	 * @param idControlMoto the idControlMoto to set
	 */
	public void setIdControlMoto(Integer idControlMoto) {
		this.idControlMoto = idControlMoto;
	}

	/**
	 * @return the idMoto
	 */
	public Integer getIdMoto() {
		return idMoto;
	}

	/**
	 * @param idMoto the idMoto to set
	 */
	public void setIdMoto(Integer idMoto) {
		this.idMoto = idMoto;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the kilometraje
	 */
	public Double getKilometraje() {
		return kilometraje;
	}

	/**
	 * @param kilometraje the kilometraje to set
	 */
	public void setKilometraje(Double kilometraje) {
		this.kilometraje = kilometraje;
	}

	/**
	 * @return the estadoControlMoto
	 */
	public Integer getEstadoControlMoto() {
		return estadoControlMoto;
	}

	/**
	 * @param estadoControlMoto the estadoControlMoto to set
	 */
	public void setEstadoControlMoto(Integer estadoControlMoto) {
		this.estadoControlMoto = estadoControlMoto;
	}

}
