package poo_pessoaabstrata;

public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;

    // Getters e Setters
    public int getMatricula() {return matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}

    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso = curso;}
    
    // Métodos
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do(a) aluno(a): " + this.getNome());
    }
    
    @Override
    public void dados(){
        System.out.println("Dados do aluno: ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println();
    }    
}
