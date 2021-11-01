package poo_banco;

public class Main {

    public static void main(String[] args) {
        
        Banco p1 = new Banco(12345, "CC", "Rafa");
        Banco p2 = new Banco(2222, "CP", "Creuza");

        p1.abrirConta();
        p2.abrirConta();
        
        p1.informacoesConta();
        p2.informacoesConta();

    }
    
}
