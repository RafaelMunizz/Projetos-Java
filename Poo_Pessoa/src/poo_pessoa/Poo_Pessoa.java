package poo_pessoa;

import java.util.ArrayList;

public class Poo_Pessoa {

    public static void main(String[] args) {
        
        ArrayList<Pessoa> p = new ArrayList<Pessoa>(2);
        ArrayList<Livro> l = new ArrayList<Livro>(3);
        
        p.add(new Pessoa("Pedro", 22, "M"));
        p.add(new Pessoa("Maria", 25, "F"));

        l.add(new Livro("Aprendendo Java", "José da Silva", p.get(0), 300));
        l.add(new Livro("POO", "Autor desconhecido", p.get(1), 500));
        l.add(new Livro("Java Avançado", "Maria Candido", p.get(0), 800));
        
        l.get(0).abrir();
        l.get(1).abrir();
        
        l.get(0).folhear(600);
        l.get(1).folhear(499);
        
        System.out.println(l.get(0).detalhes());
        System.out.println();
        System.out.println(l.get(1).detalhes());

    }
    
}
