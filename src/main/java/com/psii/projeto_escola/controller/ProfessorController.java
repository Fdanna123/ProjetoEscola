package com.psii.projeto_escola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.psii.projeto_escola.models.Professor;
import com.psii.projeto_escola.repositories.ProfessorRepository;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/professores")
    public String listar(Model model) {
        model.addAttribute("professores", professorRepository.findAll());
        return "lista_professor";
    }

    @GetMapping("/professor/novo")
    public String novoForm(Model model) {
        model.addAttribute("professor", new Professor());
        return "form_professor";
    }

    @PostMapping("/professor/salvar")
    public String salvar(@ModelAttribute Professor professor) {
        professorRepository.save(professor);
        return "redirect:/professores";
    }
}
