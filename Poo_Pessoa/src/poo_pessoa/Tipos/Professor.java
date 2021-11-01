package poo_pessoa.Tipos;
import poo_pessoa.Pessoa;

public class Professor extends Pessoa {
    
    // Atributos
    private String especialidade;
    private float salario = 0;
    
    // Construtor
    public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    // Getters e Setters
    public String getEspecialidade(){
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    // Métodos
    public void receberAumento(float valor){
        this.setSalario(this.getSalario() + valor);
    }
}
