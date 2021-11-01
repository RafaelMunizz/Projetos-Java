package poo_animal;

public class Peixe extends Animal {
        
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
    
    public void soltarBolha(){
        System.out.println("Peixe está soltando bolhas");
    }

    @Override
    public void locomover() {
        System.out.println("Peixe está nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe está se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe está emitindo som");    
    }
}
