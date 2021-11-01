package caneta;

public class Caneta {
    
    // Atributos
    private String modelo, cor;
    private float ponta;
    private boolean tampada = true;
    
    // Construtor
    public Caneta (String modelo, String cor, float ponta){
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.setTampada(true);
    }
    
    // Métodos
    public void setModelo(String m){this.modelo = m;}
    public String getModelo(){return this.modelo;}
    
    public void setCor(String c){this.cor = c;}
    public String getCor(){return this.cor;}
    
    public void setPonta(float p){this.ponta = p;}
    public float getPonta(){return this.ponta;}
    
    public void setTampada(boolean t){this.tampada = t;}
    public boolean getTampada(){return this.tampada;}
    
    public void status(){
        
        System.out.println("Informações sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada: " + this.getTampada());
    }
    
    public void rabiscar(){
        
        if (this.getTampada() == true){
            
            System.out.println("Estou rabiscando");
            
        } else {
            
            System.out.println("Destampe a canete primeiro");
        }
    }
    
    public void tampar(){
        
        if (this.getTampada() == true){
            
            System.out.println("A caneta já está tampada");
            
        } else {
            
            System.out.println("A caneta foi tampada");
            this.setTampada(true);
        }
    }
    
    public void destampar(){
        
        if (this.getTampada() == true){
            
            System.out.println("A caneta foi destampada");
            this.setTampada(false);
            
        } else {
            
            System.out.println("A caneta já está destampada");
        }
    }
}
