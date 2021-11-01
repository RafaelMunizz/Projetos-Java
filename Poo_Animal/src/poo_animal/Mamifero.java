package poo_animal;

public class Mamifero extends Animal {
    
    private String pelo = "Indefinido";

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    
    public void corPelo(){
        System.out.println("A cor do pelo é " + this.getPelo());
    }

    @Override
    public void locomover() {
        System.out.println("Mamifero está se locomovendo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamifero está se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Mamifero está emitindo som");    
    }
    
}
