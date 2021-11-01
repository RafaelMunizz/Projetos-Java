package poo_projeto;

public class Visualizacao {
    
    // Atributos //
    private Gafanhoto espectador;
    private Video filme;

    // Construtor //
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    // Getters e Setters //
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    // Métodos //
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        
        if (porc <= 20) this.filme.setAvaliacao(3);
        else if (porc <= 50) this.filme.setAvaliacao(5);
        else if (porc <= 90) this.filme.setAvaliacao(8);
        else this.filme.setAvaliacao(10);
    }

    @Override
    public String toString() {
        return "Visualizacao: " + "\nEspectador = " + espectador + "\nFilme = " + filme;
    }
    
    
    
}
