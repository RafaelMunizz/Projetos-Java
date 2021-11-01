package poo_lutador;

import java.util.ArrayList;

public class Poo_Lutador {

    public static void main(String[] args) {
        
        ArrayList<Lutador> lutadores = new ArrayList<Lutador>(6);

        lutadores.add(new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1));
        lutadores.add(new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3));
        lutadores.add(new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1));
        lutadores.add(new Lutador("Dead code", "Austrália", 28, 1.93, 81.6, 13, 0, 2));
        lutadores.add(new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3));
        lutadores.add(new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4));

        Luta uec1 = new Luta();
        uec1.marcarLuta(lutadores.get(4), lutadores.get(5));
        uec1.lutar();
        
        //lutadores.get(0).apresentar();
        //lutadores.get(1).apresentar();
        
    }
}
