package com.project.professorallocation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "professor")

public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	@Column(nullable = false)
	private String name;

	@Column(length = 11, nullable = false, unique = true)
	private String cpf;
	@Column(name = "department_id", nullable = false)
	private Long departmentId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "department_id", nullable = false, insertable = false, updatable = false)
	private Department department;
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", id=" + id + ", cpf=" + cpf + ", departmentId=" + departmentId + "]";
	}

	public Professor() {
		super();
	}

}
