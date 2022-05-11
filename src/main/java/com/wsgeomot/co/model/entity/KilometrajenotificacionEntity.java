package com.wsgeomot.co.model.entity;

import java.sql.Timestamp;

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
	private Integer knidkilometrajenoti;

	@Column(name = "mtidmoto")
	private Integer mtidmoto;

	@Column(name = "evtidevento")
	private Integer evtidevento;

	@Column(name = "nttkilometrajevalidador")
	private Double kilometrajevalidador;

	@Column(name = "kntkilometraje")
	private Double kntkilometraje;

	@Column(name = "ntfecha")
	private Timestamp ntfecha;

	@Column(name = "ntduracion")
	private double ntduracion;

	@Column(name = "ntnumrepeticion")
	private Integer ntnumrepeticion;

	@Column(name = "nttiemporepeticion")
	private double nttiemporepeticion;

	@Column(name = "stidestado")
	private Integer stidestado;

	/**
	 * @return the knidkilometrajenoti
	 */
	public Integer getKnidkilometrajenoti() {
		return knidkilometrajenoti;
	}

	/**
	 * @param knidkilometrajenoti the knidkilometrajenoti to set
	 */
	public void setKnidkilometrajenoti(Integer knidkilometrajenoti) {
		this.knidkilometrajenoti = knidkilometrajenoti;
	}

	/**
	 * @return the mtidmoto
	 */
	public Integer getMtidmoto() {
		return mtidmoto;
	}

	/**
	 * @param mtidmoto the mtidmoto to set
	 */
	public void setMtidmoto(Integer mtidmoto) {
		this.mtidmoto = mtidmoto;
	}

	/**
	 * @return the evtidevento
	 */
	public Integer getEvtidevento() {
		return evtidevento;
	}

	/**
	 * @param evtidevento the evtidevento to set
	 */
	public void setEvtidevento(Integer evtidevento) {
		this.evtidevento = evtidevento;
	}

	/**
	 * @return the kilometrajevalidador
	 */
	public Double getKilometrajevalidador() {
		return kilometrajevalidador;
	}

	/**
	 * @param kilometrajevalidador the kilometrajevalidador to set
	 */
	public void setKilometrajevalidador(Double kilometrajevalidador) {
		this.kilometrajevalidador = kilometrajevalidador;
	}

	/**
	 * @return the kntkilometraje
	 */
	public Double getKntkilometraje() {
		return kntkilometraje;
	}

	/**
	 * @param kntkilometraje the kntkilometraje to set
	 */
	public void setKntkilometraje(Double kntkilometraje) {
		this.kntkilometraje = kntkilometraje;
	}

	/**
	 * @return the ntfecha
	 */
	public Timestamp getNtfecha() {
		return ntfecha;
	}

	/**
	 * @param ntfecha the ntfecha to set
	 */
	public void setNtfecha(Timestamp ntfecha) {
		this.ntfecha = ntfecha;
	}

	/**
	 * @return the ntduracion
	 */
	public double getNtduracion() {
		return ntduracion;
	}

	/**
	 * @param ntduracion the ntduracion to set
	 */
	public void setNtduracion(double ntduracion) {
		this.ntduracion = ntduracion;
	}

	/**
	 * @return the ntnumrepeticion
	 */
	public Integer getNtnumrepeticion() {
		return ntnumrepeticion;
	}

	/**
	 * @param ntnumrepeticion the ntnumrepeticion to set
	 */
	public void setNtnumrepeticion(Integer ntnumrepeticion) {
		this.ntnumrepeticion = ntnumrepeticion;
	}

	/**
	 * @return the nttiemporepeticion
	 */
	public double getNttiemporepeticion() {
		return nttiemporepeticion;
	}

	/**
	 * @param nttiemporepeticion the nttiemporepeticion to set
	 */
	public void setNttiemporepeticion(double nttiemporepeticion) {
		this.nttiemporepeticion = nttiemporepeticion;
	}

	/**
	 * @return the stidestado
	 */
	public Integer getStidestado() {
		return stidestado;
	}

	/**
	 * @param stidestado the stidestado to set
	 */
	public void setStidestado(Integer stidestado) {
		this.stidestado = stidestado;
	}

}
