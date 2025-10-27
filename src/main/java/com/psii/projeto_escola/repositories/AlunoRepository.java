package com.psii.projeto_escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.psii.projeto_escola.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {}
