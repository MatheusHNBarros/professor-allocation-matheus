package com.project.professorallocation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "departament")
public class Department {

	@Column(length = 100, nullable = false)
	private String name;
	
	
	@JsonProperty(access = Access.READ_ONLY)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private long setProfessorId;
	private long setCourseId;

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [nome=" + name + ", id=" + id + "]";
	}

	public Department() {
			super();
		}

	public void setProfessorId(long setProfessorId) {
		this.setProfessorId = setProfessorId;
		
	}

	public void setCourseId(long setCourseId) {
		this.setCourseId = setCourseId;
		
	}

}
