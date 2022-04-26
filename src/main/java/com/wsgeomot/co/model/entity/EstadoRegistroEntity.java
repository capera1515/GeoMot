/**
 * 
 */
package com.wsgeomot.co.model.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Andres Capera
 *
 */
@Entity
@Table(name = "estado_rergistro", schema = "geomot", catalog = "")
public class EstadoRegistroEntity {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "stidestado")
	private Integer idEstadoRegistro;

	@Column(name = "siglas")
	private String siglas;

	@Column(name = "descripcin")
	private String descripcin;

	@Column(name = "fecharegistro")
	private Timestamp fechaRegistro;

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
	public Timestamp getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Timestamp fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}
