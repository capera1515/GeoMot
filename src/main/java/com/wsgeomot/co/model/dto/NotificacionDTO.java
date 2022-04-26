/**
 * 
 */
package com.wsgeomot.co.model.dto;

import java.sql.Timestamp;

/**
 * @author Andres Capera
 *
 */
public class NotificacionDTO {

	private Integer idNotificacion;
	private Integer idKilometrajeNoti;
	private Integer idPlantilla;
	private Timestamp fecha;
	private Double duracion;
	private Integer numRepeticion;
	private String tiempoRepeticion;
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
