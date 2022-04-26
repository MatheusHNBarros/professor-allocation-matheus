package com.project.professorallocation.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.professorallocation.model.Professor;

public class ProfessorServiceTest {

	@Autowired
	ProfessorService service;

	public void create() throws ParseException {
		Professor professor = new Professor();

		professor.setProfessorId(4L);
		professor.setCourseId(2L);

		professor = service.create(professor);

	}

}
