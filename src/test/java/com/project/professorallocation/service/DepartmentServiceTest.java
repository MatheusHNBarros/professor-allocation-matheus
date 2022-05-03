package com.project.professorallocation.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.professorallocation.model.Department;
import com.project.professorallocation.model.Department;

public class DepartmentServiceTest {

	@Autowired
	DepartmentService service;
	
	@Test
	public void create() throws ParseException {  
		Department department = new Department();
		department.setProfessorId(4L);
		department.setCourseId(2L);
	
		department = service.create(department);
	}
	
	@Test
	public void update() {
		Department department = new Department();
		department.setProfessorId(4L);
		department.setCourseId(2L);

		department = service.update(department);
	}

}
