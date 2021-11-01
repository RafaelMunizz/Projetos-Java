package poo_pessoa.Tipos;

import poo_pessoa.Pessoa;

public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;

    // Construtor
    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    // Getters e Setters
    public int getMatricula() {return matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}

    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso = curso;}
    
    // Métodos
    public void cancelarMatricula() {
        this.setMatricula(0);
    }    
}
