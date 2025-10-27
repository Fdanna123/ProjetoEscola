package com.psii.projeto_escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.psii.projeto_escola.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
