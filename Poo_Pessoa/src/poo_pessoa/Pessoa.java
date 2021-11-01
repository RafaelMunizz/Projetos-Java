package poo_pessoa;

public class Pessoa {
    
    // Atributos
    private String nome, sexo;
    private int idade;
    
    // Construtor
    public Pessoa (String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    // Setters e getters

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    
    // Métodos
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
}
