package com.project.professorallocation.repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professorallocation.model.Allocation;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class AllocationRepositoryTest {

	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mmZ");

	@Autowired
	AllocationRepository repository;

	@Test
	public void create() throws ParseException {
		Allocation allocation = new Allocation();
		allocation.setDayOfWeek(DayOfWeek.THURSDAY);
		allocation.setStarHour(sdf.parse("19:00-0300"));
		allocation.setEndHour(sdf.parse("21:00-0300"));
		allocation.setProfessorId(1L);
		allocation.setCourseId(1L);

		allocation = repository.save(allocation);

		System.out.println(allocation);
	}

	@Test
	public void findAll() {
		List<Allocation> allocations = repository.findAll();

		allocations.forEach(System.out::println);
	}

	@Test
	public void findAllByProfessorId() {
		List<Allocation> allAllocationsOfASpecificProfessor = repository.findByProfessorId(1L);

		allAllocationsOfASpecificProfessor.forEach(System.out::println);
		
		}
	}
	
	// @Test
	// public void create() {
	// Allocation allocationBeingCreated = new Allocation();
	// allocationBeingCreated.setName("Departamento de informática");

	// allocationBeingCreated = repository.save(allocationBeingCreated);
	// System.out.println(allocationBeingCreated);
	// }

	//@Test
	//public void udate() {
		//Allocation allocationBeingCreated = new Allocation();
		//allocationBeingCreated.setId(5L);
		//allocationBeingCreated.setName("Departamento de fisioterapia");

		//allocationBeingCreated = repository.save(allocationBeingCreated);
		//System.out.println(allocationBeingCreated);

	//}

	//@Test
	//public void delete() {
		//repository.deleteById(null);
	//}

	//@Test
	//public void deleteAllItems() {
		//repository.deleteAllInBatch();
	//}
//}
