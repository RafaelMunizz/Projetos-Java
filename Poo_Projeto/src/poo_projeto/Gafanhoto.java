package poo_projeto;

public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto { " + "Login = " + login + " | Total Assistido = " + totAssistido + " }";
    }

    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }
}
