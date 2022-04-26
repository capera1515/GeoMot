package com.wsgeomot.co.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moto", schema = "geomot")
public class MotoEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "mtidmoto")
	private Integer idMoto;

	@Column(name = "peridpersona")
	private Integer idPersona;

	@Column(name = "mtreferencia")
	private String referencia;

	@Column(name = "mtclase")
	private String clase;

	@Column(name = "maidmarca")
	private Integer marca;

	@Column(name = "cleidcilindraje")
	private Integer cleidcilindraje;

	 @Column(name = "mtmodelo")
	private String modelo;

	@Column(name = "mtplaca")
	private String placa;

	@Column(name = "cbeidcombustilbe")
	private Integer combustilbe;

	@Column(name = "mtnummotor")
	private String numMotor;

	@Column(name = "mtnumchasis")
	private String numChasis;

	@Column(name = "mtvin")
	private String vin;

	@Column(name = "mtlinea")
	private String linea;

	@Column(name = "clidcolor")
	private Integer color;

	@Column(name = "mtpeso")
	private Double peso;

	@Column(name = "stidestado")
	private Integer estadoMoto;

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
	 * @return the referencia
	 */
	public String getReferencia() {
		return referencia;
	}

	/**
	 * @param referencia the referencia to set
	 */
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	/**
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}

	/**
	 * @param clase the clase to set
	 */
	public void setClase(String clase) {
		this.clase = clase;
	}

	/**
	 * @return the marca
	 */
	public Integer getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(Integer marca) {
		this.marca = marca;
	}

	/**
	 * @return the cleidcilindraje
	 */
	public Integer getCleidcilindraje() {
		return cleidcilindraje;
	}

	/**
	 * @param cleidcilindraje the cleidcilindraje to set
	 */
	public void setCleidcilindraje(Integer cleidcilindraje) {
		this.cleidcilindraje = cleidcilindraje;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the combustilbe
	 */
	public Integer getCombustilbe() {
		return combustilbe;
	}

	/**
	 * @param combustilbe the combustilbe to set
	 */
	public void setCombustilbe(Integer combustilbe) {
		this.combustilbe = combustilbe;
	}

	/**
	 * @return the numMotor
	 */
	public String getNumMotor() {
		return numMotor;
	}

	/**
	 * @param numMotor the numMotor to set
	 */
	public void setNumMotor(String numMotor) {
		this.numMotor = numMotor;
	}

	/**
	 * @return the numChasis
	 */
	public String getNumChasis() {
		return numChasis;
	}

	/**
	 * @param numChasis the numChasis to set
	 */
	public void setNumChasis(String numChasis) {
		this.numChasis = numChasis;
	}

	/**
	 * @return the vin
	 */
	public String getVin() {
		return vin;
	}

	/**
	 * @param vin the vin to set
	 */
	public void setVin(String vin) {
		this.vin = vin;
	}

	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}

	/**
	 * @param linea the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}

	/**
	 * @return the color
	 */
	public Integer getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Integer color) {
		this.color = color;
	}

	/**
	 * @return the peso
	 */
	public Double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	/**
	 * @return the estadoMoto
	 */
	public Integer getEstadoMoto() {
		return estadoMoto;
	}

	/**
	 * @param estadoMoto the estadoMoto to set
	 */
	public void setEstadoMoto(Integer estadoMoto) {
		this.estadoMoto = estadoMoto;
	}

}
