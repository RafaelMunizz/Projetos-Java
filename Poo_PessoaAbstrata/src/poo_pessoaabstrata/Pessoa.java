package poo_pessoaabstrata;

public abstract class Pessoa {
    
    // Atributos
    private String nome, sexo = "Indefinido";
    private int idade;
    
    // Setters e getters

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    
    // Métodos
    public final void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
    
    public void dados(){
        System.out.println("Dados do(a) visitante: ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println();
    }
    
    
}
