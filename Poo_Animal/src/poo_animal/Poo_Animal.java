package poo_animal;

public class Poo_Animal {

    public static void main(String[] args) {
        
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        
        // Mamifero
        m1.setIdade (6);
        m1.setMembros(4);
        m1.setPeso(15);
        m1.setPelo("Marron");
        
        // Reptil
        r1.setIdade(10);
        r1.setMembros(0);
        r1.setPeso(30);
        r1.setEscama("Verde");
        
        // Peixe
        p1.setIdade(3);
        p1.setMembros(0);
        p1.setPeso(1);
        p1.setEscama("Laranja");
        p1.soltarBolha();
        
        // Ave
        a1.setIdade(12);
        a1.setMembros(2);
        a1.setPeso(40);
        a1.sePena("Branco");
        a1.fazerNinho();
        
        // Cachorro
        
        Cachorro c1 = new Cachorro();
        c1.reagir("Olá");
        c1.reagir("Vai apanhar");
        c1.reagir(true);
        c1.reagir(11, 20);
        c1.reagir(15, 5.5f);
    }
    
}
