package poo_pessoaabstrata;

public class Poo_PessoaAbstrata {

    public static void main(String[] args) {
        
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        // Herança Visitante
        v1.setNome("Fulano");
        v1.setIdade(20);
        v1.setSexo("M");
        v1.dados();
        
        // Herança Aluno
        a1.setNome("Cicrano");
        a1.setIdade(25);
        a1.setSexo("M");
        a1.setCurso("Medicina");
        a1.setMatricula(124578963);
        
        a1.fazerAniver();
        
        a1.dados();
        
        // Herança Bolsista
        b1.setNome("Lisa");
        b1.setIdade(29);
        b1.setSexo("F");
        b1.setCurso("Engenharia");
        b1.setMatricula(124588659);
        b1.setBolsa(450f);
        
        b1.renovarBolsa();
        
        b1.dados();
    }
}
