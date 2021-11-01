package poo_pessoaabstrata;

public class Bolsista extends Aluno {
    
    private float bolsa;
    

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
         System.out.println("Renovando bolsa do(a) aluno(a): " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do(a) aluno(a): " + this.getNome());
    }
        
    @Override
    public void dados(){
        System.out.println("Dados do(a) aluno(a) (bolsista): ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Valor da bolsa: " + this.getBolsa());
        System.out.println();
    }  
}
