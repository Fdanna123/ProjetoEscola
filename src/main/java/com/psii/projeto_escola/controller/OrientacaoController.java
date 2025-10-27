package com.psii.projeto_escola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.psii.projeto_escola.models.Orientacao;
import com.psii.projeto_escola.repositories.OrientacaoRepository;
import com.psii.projeto_escola.repositories.AlunoRepository;
import com.psii.projeto_escola.repositories.ProfessorRepository;

@Controller
public class OrientacaoController {

    @Autowired
    private OrientacaoRepository orientacaoRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/orientacoes")
    public String listar(Model model) {
        model.addAttribute("orientacoes", orientacaoRepository.findAll());
        return "lista_orientacao";
    }

    @GetMapping("/orientacao/nova")
    public String novaForm(Model model) {
        model.addAttribute("orientacao", new Orientacao());
        model.addAttribute("alunos", alunoRepository.findAll());
        model.addAttribute("professores", professorRepository.findAll());
        return "form_orientacao";
    }

    @PostMapping("/orientacao/salvar")
    public String salvar(@ModelAttribute Orientacao orientacao) {
        orientacaoRepository.save(orientacao);
        return "redirect:/orientacoes";
    }
}
