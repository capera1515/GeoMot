package com.wsgeomot.co.model.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "control_estado_moto", schema = "geomot")
public class ControlEstadoMotoEntity {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "cemidcontrolmoto")
	private Integer idControlMoto;

	@Column(name = "mtidmoto")
	private Integer idMoto;

	@Column(name = "cmfecha")
	private Timestamp fecha;

	@Column(name = "cemkilometraje")
	private Double kilometraje;

	@Column(name = "stidestado")
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
	public Timestamp getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Timestamp fecha) {
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
