package com.project.professorallocation.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.professorallocation.model.Professor;

public class ProfessorServiceTest {

	@Autowired
	ProfessorService service;
	
	
	@Test
	public void create() {
		Professor professor = new Professor();
		professor.setName("Matheus");
		professor.setDepartmentId(2L);
		professor.setCpf("15824698567");
		professor.setCourseId(3L);
		
		professor = service.create(professor);

	}
	
	@Test
	public void update() {
		Professor professor = new Professor();
		professor.setId(4L);
		professor.setName("Matheus");
		professor.setDepartmentId(2L);
		professor.setCpf("15824698567");

		professor = service.update(professor);
	}

}
