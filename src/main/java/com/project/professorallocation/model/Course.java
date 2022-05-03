package com.project.professorallocation.model;

import java.time.DayOfWeek;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "course")
public class Course {
	
	@JsonProperty(access = Access.READ_ONLY)
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@Column(unique = true, nullable = false)
	private String nome;
	

	public Course() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", nome=" + nome + "]";
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setDayOfWeek(DayOfWeek monday) {
		// TODO Auto-generated method stub
		
	}

	public void setProfessorId(long l) {
		// TODO Auto-generated method stub
		
	}

	public void setCourseId(long l) {
		// TODO Auto-generated method stub
		
	}

	public void setStarHour(Date parse) {
		// TODO Auto-generated method stub
		
	}

	public void setEndHour(Date parse) {
		// TODO Auto-generated method stub
		
	}

	

}
