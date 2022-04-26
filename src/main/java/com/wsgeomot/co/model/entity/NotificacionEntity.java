package com.wsgeomot.co.model.entity;

import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notificacion", schema = "geomot", catalog = "")
public class NotificacionEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ntidnotifiacion")
	private Integer idNotificacion;

	@Basic
	@Column(name = "knidkilometrajenoti")
	private Integer idKilometrajeNoti;

	@Basic
	@Column(name = "pllidplantilla")
	private Integer idPlantilla;

	@Basic
	@Column(name = "ntfecha")
	private Timestamp fecha;

	@Basic
	@Column(name = "ntduracion")
	private Double duracion;

	@Basic
	@Column(name = "ntnumrepeticion")
	private Integer numRepeticion;

	@Basic
	@Column(name = "nttiemporepeticion")
	private String tiempoRepeticion;

	@Basic
	@Column(name = "stidestado")
	private Integer estado;

	/**
	 * @return the idNotificacion
	 */
	public Integer getIdNotificacion() {
		return idNotificacion;
	}

	/**
	 * @param idNotificacion the idNotificacion to set
	 */
	public void setIdNotificacion(Integer idNotificacion) {
		this.idNotificacion = idNotificacion;
	}

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
	 * @return the idPlantilla
	 */
	public Integer getIdPlantilla() {
		return idPlantilla;
	}

	/**
	 * @param idPlantilla the idPlantilla to set
	 */
	public void setIdPlantilla(Integer idPlantilla) {
		this.idPlantilla = idPlantilla;
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
	 * @return the duracion
	 */
	public Double getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the numRepeticion
	 */
	public Integer getNumRepeticion() {
		return numRepeticion;
	}

	/**
	 * @param numRepeticion the numRepeticion to set
	 */
	public void setNumRepeticion(Integer numRepeticion) {
		this.numRepeticion = numRepeticion;
	}

	/**
	 * @return the tiempoRepeticion
	 */
	public String getTiempoRepeticion() {
		return tiempoRepeticion;
	}

	/**
	 * @param tiempoRepeticion the tiempoRepeticion to set
	 */
	public void setTiempoRepeticion(String tiempoRepeticion) {
		this.tiempoRepeticion = tiempoRepeticion;
	}

	/**
	 * @return the estado
	 */
	public Integer getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
