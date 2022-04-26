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
@Table(name = "departament")
public class Department {

	@Column(length = 100, nullable = false)
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private long setProfessorId;
	private DayOfWeek setDayOfWeek;
	private long setCourseId;
	private Date setStarHour;
	private Date setEndHour;

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

	public void setDayOfWeek(DayOfWeek setDayWeek) {
	this.setDayOfWeek = setDayWeek;
		
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
