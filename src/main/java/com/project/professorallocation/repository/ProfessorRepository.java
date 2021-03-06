package com.project.professorallocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professorallocation.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
