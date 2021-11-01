package caneta;

public class Main {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("BIC", "Azul", 1.0f);
        c1.destampar();
        c1.destampar();

        c1.status();
    }
    
}
