package com.wsgeomot.co.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kilometrajenotificacion", schema = "geomot")
public class KilometrajenotificacionEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "knidkilometrajenoti")
	private Integer idKilometrajeNoti;

	@Column(name = "mtidmoto")
	private Integer idMoto;

	@Column(name = "evtidevento")
	private Integer idEvento;

	@Column(name = "kntkilometraje")
	private Double kilometrajeNoti;

	@Column(name = "stidestado")
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

	/**
	 * @return the idEvento
	 */
	public Integer getIdEvento() {
		return idEvento;
	}

	/**
	 * @param idEvento the idEvento to set
	 */
	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	/**
	 * @return the kilometrajeNoti
	 */
	public Double getKilometrajeNoti() {
		return kilometrajeNoti;
	}

	/**
	 * @param kilometrajeNoti the kilometrajeNoti to set
	 */
	public void setKilometrajeNoti(Double kilometrajeNoti) {
		this.kilometrajeNoti = kilometrajeNoti;
	}

	/**
	 * @return the estadoKilometrajeNoti
	 */
	public Integer getEstadoKilometrajeNoti() {
		return estadoKilometrajeNoti;
	}

	/**
	 * @param estadoKilometrajeNoti the estadoKilometrajeNoti to set
	 */
	public void setEstadoKilometrajeNoti(Integer estadoKilometrajeNoti) {
		this.estadoKilometrajeNoti = estadoKilometrajeNoti;
	}

}
