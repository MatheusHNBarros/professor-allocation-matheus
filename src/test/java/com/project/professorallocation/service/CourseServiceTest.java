package com.project.professorallocation.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.professorallocation.model.Course;
import com.project.professorallocation.model.Course;

public class CourseServiceTest {

	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mmZ");
	
	@Autowired
	CourseService service;
	
	@Test
	public void create() throws ParseException {  
		Course course = new Course();
		course.setDayOfWeek(DayOfWeek.MONDAY);
		course.setProfessorId(4L);
		course.setCourseId(2L);
		course.setStarHour(sdf.parse("19:00-0300"));
		course.setEndHour(sdf.parse("21:00-0300"));
		
		course = service.create(course);
	}
	
	@Test
	public void update() throws ParseException {
		Course course = new Course();
		course.setDayOfWeek(DayOfWeek.MONDAY);
		course.setProfessorId(4L);
		course.setCourseId(2L);
		course.setStarHour(sdf.parse("19:00-0300"));
		course.setEndHour(sdf.parse("21:00-0300"));;

		course = service.update(course);
	}

}
