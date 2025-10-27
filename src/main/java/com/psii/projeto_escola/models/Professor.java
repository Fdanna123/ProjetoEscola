package com.psii.projeto_escola.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String area;
    private String email;
    private String matricula;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private List<Orientacao> orientacoes;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public List<Orientacao> getOrientacoes() { return orientacoes; }
    public void setOrientacoes(List<Orientacao> orientacoes) { this.orientacoes = orientacoes; }
}
