package poo_pessoa;

public class Livro implements Publicacao {
    
    // Atributos
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Construtor
    public Livro(String titulo, String autor, Pessoa leitor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
    }
    
    // Setters e Getters
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public Pessoa getLeitor() {return leitor;}
    public void setLeitor(Pessoa leitor) {this.leitor = leitor;}

    public int getTotPaginas() {return totPaginas;}
    public void setTotPaginas(int totPaginas) {this.totPaginas = totPaginas;}

    public int getPagAtual() {return pagAtual;}
    public void setPagAtual(int pagAtual) {this.pagAtual = pagAtual;}

    public boolean isAberto() {return aberto;}
    public void setAberto(boolean aberto) {this.aberto = aberto;}
    
    /*
    // Métodos
    public void detalhes(){
        System.out.println("Detalhes do livro:");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Leitor: " + this.getLeitor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Está aberto? -> " + this.isAberto());
    } */   

    public String detalhes() {
        return "Livro:\n" + "titulo = " + titulo + "\nautor = "
                + autor + "\ntotPaginas = " + totPaginas 
                + "\npagAtual = " + pagAtual + "\naberto = " 
                + aberto + "\nleitor = " + leitor.getNome();
    }
    
    // Métodos especiais 
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotPaginas()){
            this.setPagAtual(this.getTotPaginas());
        } else {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.pagAtual++);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.pagAtual--);
    }
    
}
