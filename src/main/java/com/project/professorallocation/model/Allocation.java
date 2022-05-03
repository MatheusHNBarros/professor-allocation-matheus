package com.project.professorallocation.model;

import java.time.DayOfWeek;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "allocation")
public class Allocation {
	
	@JsonProperty(access = Access.READ_ONLY)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, name = "day")
	private DayOfWeek dayOfWeek;
	
	@Temporal(TemporalType.TIME)
	@Column(nullable = false)
	private Date starHour;
	
	@Temporal(TemporalType.TIME)
	private Date endHour;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@Column(name = "professor_id", nullable = false)
	private Long professorId;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@Column(name = "course_id", nullable = false)
	private Long courseId;

	private Object setName;

	private Object setCourse;

	private Object setProfessor;

	private Date startHour;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public Date getStartHour() {
		return startHour;
	}

	public void setStartHour(Date startHour) {
		this.startHour = startHour;
	}

	public Date getEndHour() {
		return endHour;
	}

	public void setEndHour(Date endHour) {
		this.endHour = endHour;
	}

	public Long getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Long professorId) {
		this.professorId = professorId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Allocation [id=" + id + ", dayOfWeek=" + dayOfWeek + ", starHour=" + starHour + ", endHour=" + endHour
				+ ", professorId=" + professorId + ", courseId=" + courseId + "]";
	}

	public Allocation() {
		super();
	}

	public void setName(String setName) {
		this.setSetName(setName);
		
	}

	public void setCourse(Course course) {
		this.setCourse = setCourse;
		
	}

	public void setProfessor(Professor professor) {
		this.setProfessor = setProfessor;
		
	}

	public Object getSetName() {
		return setName;
	}

	public void setSetName(Object setName) {
		this.setName = setName;
	}
	
	

}
