package com.project.professorallocation.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;


import com.project.professorallocation.model.Course;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class CourseRepositoryTest {
	
	@Autowired
	CourseRepository repository;
	
	@Test
	public void findAll() {
		List<Course> items = repository.findAll();

		System.out.println("Qtd elementos retornados: " + items.size());

		for (Course item : items) {
			System.out.println(item);
		}
	}
	@Test
	public void findSpecificCourse() {
		Course dept = repository.findById(2L).orElse(null);

		System.out.println(dept);
	}

	@Test
	public void create() {
		Course courseBeingCreated = new Course();
		courseBeingCreated.setName("Departamento de informática");

		courseBeingCreated = repository.save(courseBeingCreated);
		System.out.println(courseBeingCreated);
	}

	@Test
	public void udate() {
		Course courseBeingCreated = new Course();
		courseBeingCreated.setId(5L);
		courseBeingCreated.setName("Departamento de fisioterapia");

		courseBeingCreated = repository.save(courseBeingCreated);
		System.out.println(courseBeingCreated);

	}

	@Test
	public void delete() {
		repository.deleteById(null);
	}

	@Test
	public void deleteAllItems() {
		repository.deleteAllInBatch();
	}
}



