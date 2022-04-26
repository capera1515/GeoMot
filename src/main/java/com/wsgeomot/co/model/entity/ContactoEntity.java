package com.wsgeomot.co.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacto", schema = "geomot", catalog = "")
public class ContactoEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ctoidcontacto")
	private Integer idContacto;

	@Column(name = "peridpersona")
	private Integer idPersona;

	@Column(name = "ctotipocontacto")
	private Integer tipocontacto;

	@Column(name = "ctovalor")
	private String valor;

	@Column(name = "stidestado")
	private Integer estadoContacto;

	/**
	 * @return the idContacto
	 */
	public Integer getIdContacto() {
		return idContacto;
	}

	/**
	 * @param idContacto the idContacto to set
	 */
	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
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
	 * @return the tipocontacto
	 */
	public Integer getTipocontacto() {
		return tipocontacto;
	}

	/**
	 * @param tipocontacto the tipocontacto to set
	 */
	public void setTipocontacto(Integer tipocontacto) {
		this.tipocontacto = tipocontacto;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
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
