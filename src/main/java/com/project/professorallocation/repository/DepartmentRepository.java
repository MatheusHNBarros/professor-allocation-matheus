package com.project.professorallocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professorallocation.model.Department;
import com.project.professorallocation.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	// SELECT * FROM department WHERE name = name
	List<Department> findByName(String name);

	// SELECT * FROM department WHERE name LIKE %name%
	List<Department> findByNameLike(String name);


}
