package com.wsgeomot.co.model.dto;

public class KilometrajenotificacionDTO {

	private Integer idKilometrajeNoti;
	private Integer idMoto;
	private Integer idEvento;
	private Double kilometrajeNoti;
	private Integer estadoKilometrajeNoti;

	/**
	 * @return the idKilometrajeNoti
	 */
	public Integer getIdKilometrajeNoti() {
		return idKilometrajeNoti;
	}

	/**
	 * @param idKilometrajeNoti the idKilometrajeNoti to set
	 */
	public void setIdKilometrajeNoti(Integer idKilometrajeNoti) {
		this.idKilometrajeNoti = idKilometrajeNoti;
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

	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public Double getKilometrajeNoti() {
		return kilometrajeNoti;
	}

	public void setKilometrajeNoti(Double kilometrajeNoti) {
		this.kilometrajeNoti = kilometrajeNoti;
	}

	public Integer getEstadoKilometrajeNoti() {
		return estadoKilometrajeNoti;
	}

	public void setEstadoKilometrajeNoti(Integer estadoKilometrajeNoti) {
		this.estadoKilometrajeNoti = estadoKilometrajeNoti;
	}
}
