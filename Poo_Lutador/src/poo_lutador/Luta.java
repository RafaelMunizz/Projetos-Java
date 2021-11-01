package poo_lutador;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {return desafiado;}
    public void setDesafiado(Lutador desafiado) {this.desafiado = desafiado;}

    public Lutador getDesafiante() {return desafiante;}
    public void setDesafiante(Lutador desafiante) {this.desafiante = desafiante;}

    public int getRounds() {return rounds;}
    public void setRounds(int rounds) {this.rounds = rounds;}

    public boolean isAprovada() {return aprovada;}
    public void setAprovada(boolean aprovada) {this.aprovada = aprovada;}

    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria().equals(l2.getCategoria())) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);                    
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.isAprovada()){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            int vencedor = (int)(Math.random() * 3);
            
            switch(vencedor){
                case 0: // Empate
                    
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1: // Desafiado ganhou
                    
                    System.out.println(this.desafiado.getNome() + " ganhou a luta");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();   
                    break;
                    
                case 2: // Desafiante ganhou
                    
                    System.out.println(this.desafiante.getNome() + " ganhou a luta");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            } 
            
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
}
