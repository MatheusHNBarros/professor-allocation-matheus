package com.project.professorallocation.model;

import java.time.DayOfWeek;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true, nullable = false)
	private String nome;
	private DayOfWeek setDayOfWeek;
	private long setProfessorId;
	private long setCourseId;
	private Date setStarHour;
	private Date setEndHour;

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

	public void setDayOfWeek(DayOfWeek setDayOfWeek) {
		this.setDayOfWeek = setDayOfWeek;
		
	}

	public void setProfessorId(long setProfessorId) {
		this.setProfessorId = setProfessorId;
		
	}

	public void setCourseId(long setCourseId) {
		this.setCourseId = setCourseId;		
	}

	public void setStarHour(Date setStarHour) {
		this.setStarHour = setStarHour;	
	}

	public void setEndHour(Date setEndHour) {
		this.setEndHour = setEndHour;
		
	}

}
