package poo_animal;

public class Ave extends Animal {
        
    private String pena = "Indefinido";

    public String getPena() {
        return pena;
    }

    public void sePena(String pena) {
        this.pena = pena;
    }
    
    public void corpena(){
        System.out.println("A cor do pena é " + this.getPena());
    }
    
    public void fazerNinho(){
        System.out.println("Ave está fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Ave está voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Ave está se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ave está emitindo som");    
    }
}
