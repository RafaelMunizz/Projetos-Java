package poo_pessoa.Tipos;
import poo_pessoa.Pessoa;

public class Funcionario extends Pessoa {
    
    // Atributos
    private String setor;
    private boolean trabalhando = false;
    
    // Construtor    
    public Funcionario(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    // Getters e Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    // Métodos
    public void mudarTrabalho(){
        
    }
}
