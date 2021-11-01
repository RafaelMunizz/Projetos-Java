package poo_banco;

public class Banco {
    
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo = 0;
    private boolean status;

    // Construtor
    public Banco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        
        if (this.tipo.equals("CC")){
            this.saldo = saldo + 50;
        } else if (this.tipo.equals("CP")){
            this.saldo = saldo + 150;
        }
        
        this.status = false;
    }
    
    // Métodos
    public int getNumConta() {return numConta;}
    public void setNumConta(int numConta) {this.numConta = numConta;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getDono() {return dono;}
    public void setDono(String dono) {this.dono = dono;}

    public float getSaldo() {return saldo;}
    public void setSaldo(float saldo) {this.saldo = saldo;}

    public boolean getStatus() {return status;}
    public void setStatus(boolean status) {this.status = status;}
    
    public void informacoesConta(){
        
        if (this.getStatus() == true){
            
            String estadoConta = this.getStatus() ? "Ativa" : "Fechada";
            String tipoConta = this.getTipo().equals("CC") ? "Conta Corrente": "Conta Poupança";

            System.out.println("\nInformações da conta: ");
            System.out.println("Titular: " + this.getDono());
            System.out.println("Número: " + this.getNumConta());
            System.out.println("Tipo: " + tipoConta);
            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("Estado: " + estadoConta);
            
        } else {
            
            System.out.println("Conta fechada. Abra sua conta para ter acesso a informações.");
        }
    }
    
    public void abrirConta(){
        
        String tipoConta = this.getTipo().equals("CC") ? "Conta Corrente": "Conta Poupança";
        int incentivo = this.getTipo().equals("CC") ? 50: 150;
        
        if (this.getStatus() == false){
            System.out.printf("%s de %s, N° %d, foi aberta.\nComo incentivo, você ganhou o valor de R$%d,00.\n",
                    tipoConta, this.getDono(), this.getNumConta(), incentivo);
            this.setStatus(true);
            
        } else {
            System.out.println("Esta conta já está aberta");
        }
    }
    
    public void fecharConta(){
        
        if (this.getStatus() == true){
            
            if (this.getSaldo() > 0){
                System.out.println("Para fechar a conta é necessário que não haja dinheiro nela.");
                
            } else if (this.getSaldo() < 0){
                System.out.println("Você ainda possui um débito e a conta não será fechada até ser quitado.");
                
            } else {
                System.out.printf("Conta de %s, N° %d, foi fechada. Obrigado por usar nosso banco.\n", this.getDono(), this.getNumConta());
                this.setStatus(false);
            }
            
        } else {
            System.out.println("Esta conta já está fechada");
        }
    }
    
    public void depositar(int valor){
        
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Valor depositado com sucesso.");
        } else {
            System.out.println("Não é possível depositar em uma conta fechada. Abra a conta antes.");
        }
    }
    
    public void sacar(int valor){
        
        if (this.getStatus() == true){
            
            if (this.getSaldo() < valor){
                System.out.println("Operação negada. Seu saldo é menor que o saque desejado.");
                
            } else {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Valor sacado com sucesso.");
            }
            
        } else {
            
            System.out.println("Não é possível sacar de uma conta fechada. Abra a conta antes.");
        }
    }
    
    public void pagarMensal(){
        
        if (this.getStatus() == true){
            
            if (this.getTipo().equals("CC")){
                this.setSaldo(this.getSaldo() - 12);
                System.out.println("Pagamento mensal de R$12,00 realizado com sucesso.");
                
            } else if (this.getTipo().equals("CP")) {
                this.setSaldo(this.getSaldo() - 20);
                System.out.println("Pagamento mensal de R$20,00 realizado com sucesso.");
            }
            
        } else {
            
            System.out.println("Não é possível pagar mensalidade de uma conta fechada.");
        }
    }
}