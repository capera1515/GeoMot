package com.wsgeomot.co.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "persona", schema = "geomot")
public class PersonaEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "peridpersona")
	private Integer idPersona;

	@Column(name = "tdcidtipodocumento")
	private Integer tipoDocumento;

	@Column(name = "pernumdocumento")
	private String numDocumento;

	@Column(name = "pernombres")
	private String nombres;

	@Column(name = "perapellidos")
	private String apellidos;

	@Column(name = "sxidtiposexo")
	private Integer sexo;

	@Column(name = "perfirmadigital")
	private byte[] firmaDigital;

	@Column(name = "perfoto")
	private byte[] foto;

	@CreatedDate
	@Column(name = "perfechanacimiento")
	private Date fechaNacimiento;

	@Column(name = "perestatura")
	private Double estatura;

	@Column(name = "perpeso")
	private Double peso;

	@Column(name = "trhidtiporh")
	private Integer tipoRh;

	@Column(name = "stidestado")
	private Integer estadoPersona;

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
	 * @return the tipoDocumento
	 */
	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the numDocumento
	 */
	public String getNumDocumento() {
		return numDocumento;
	}

	/**
	 * @param numDocumento the numDocumento to set
	 */
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the sexo
	 */
	public Integer getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the firmaDigital
	 */
	public byte[] getFirmaDigital() {
		return firmaDigital;
	}

	/**
	 * @param firmaDigital the firmaDigital to set
	 */
	public void setFirmaDigital(byte[] firmaDigital) {
		this.firmaDigital = firmaDigital;
	}

	/**
	 * @return the foto
	 */
	public byte[] getFoto() {
		return foto;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the estatura
	 */
	public Double getEstatura() {
		return estatura;
	}

	/**
	 * @param estatura the estatura to set
	 */
	public void setEstatura(Double estatura) {
		this.estatura = estatura;
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
	 * @return the tipoRh
	 */
	public Integer getTipoRh() {
		return tipoRh;
	}

	/**
	 * @param tipoRh the tipoRh to set
	 */
	public void setTipoRh(Integer tipoRh) {
		this.tipoRh = tipoRh;
	}

	/**
	 * @return the estadoPersona
	 */
	public Integer getEstadoPersona() {
		return estadoPersona;
	}

	/**
	 * @param estadoPersona the estadoPersona to set
	 */
	public void setEstadoPersona(Integer estadoPersona) {
		this.estadoPersona = estadoPersona;
	}

}
