package com.velasco.ejercicio.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Cod First ue 1ro codificar los modelos y apartir de eso generar la BD
//javax.persistence es el ORM => JPA 

@Entity 
@Table(name="materias")
public class Materia implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idmateria")
	private Integer idmateria;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="nrc")
	private String nrc;
	
	@Column(name="creditos")
	private String creditos;

	public Materia() {
		super();
	}
	
	public Materia(Integer id) {
		super();
		this.idmateria=id;
	}

	public Integer getIdmateria() {
		return idmateria;
	}

	public void setIdmateria(Integer idmateria) {
		this.idmateria = idmateria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	}

	public String getCreditos() {
		return creditos;
	}

	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}
	
	

}
