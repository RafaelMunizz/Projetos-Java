package poo_animal;

public class Reptil extends Animal {
    
    private String escama = "Indefinido";

    public String getEscama() {
        return escama;
    }

    public void setEscama(String escama) {
        this.escama = escama;
    }
    
    public void corEscama(){
        System.out.println("A cor do escama é " + this.getEscama());
    }

    @Override
    public void locomover() {
        System.out.println("Reptil está rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Reptil está se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Reptil está emitindo som");    
    }
}
