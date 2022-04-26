package com.project.professorallocation.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.professorallocation.model.Department;

public class DepartmentServiceTest {

	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mmZ");
	
	@Autowired
	DepartmentService service;
	
	public void create() throws ParseException {  
		Department department = new Department();
		department.setDayOfWeek(DayOfWeek.THURSDAY);
		department.setProfessorId(4L);
		department.setCourseId(2L);
		department.setStarHour(sdf.parse("19:00-0300"));
		department.setEndHour(sdf.parse("21:00-0300"));
		
		department = service.create(department);
		
		
	}
	
}
