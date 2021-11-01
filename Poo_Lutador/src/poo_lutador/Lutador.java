package poo_lutador;

public class Lutador implements Lutador_Interf{
    private String nome;
    private String nacionalidade;        
    private int idade;        
    private double altura;        
    private double peso;        
    private String categoria;        
    private int vitorias;        
    private int derrotas;        
    private int empates;

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getNacionalidade() {return nacionalidade;}
    public void setNacionalidade(String nacionalidade) {this.nacionalidade = nacionalidade;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {return categoria;}
    private void setCategoria() {
        if (this.peso < 52.2f) {this.categoria = "Inválido";}
        else if (this.peso <= 70.3f) {this.categoria = "Leve";}
        else if (this.peso <= 83.9f) {this.categoria = "Médio";}
        else if (this.peso <= 120.2f) {this.categoria = "Pesado";}
        else {this.categoria = "Inválido";}
    }

    public int getVitorias() {return vitorias;}
    public void setVitorias(int vitorias) {this.vitorias = vitorias;}

    public int getDerrotas() {return derrotas;}
    public void setDerrotas(int derrotas) {this.derrotas = derrotas;}

    public int getEmpates() {return empates;}
    public void setEmpates(int empates) {this.empates = empates;}
    
    // Construtor
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    
    // Métodos abstratos
    @Override
    public void apresentar() {
        System.out.println("APRESENTAÇÃO:");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitorias() + " lutas");
        System.out.println("Perdeu: " + this.getDerrotas() + " lutas");
        System.out.println("Empatou: " + this.getEmpates() + " lutas");
        System.out.println("");
    }

    @Override
    public void status() {
        System.out.print("Diretamente do(a) " + this.getNacionalidade() + ", ");
        System.out.print(this.getNome() + " é um lutador peso " + this.getCategoria());
        System.out.printf(" que possui %d vitórias, %d derrotas e %d empates.\n", this.getVitorias(), this.getDerrotas(), this.getEmpates());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
