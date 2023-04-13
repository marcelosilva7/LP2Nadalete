package edu.fatec.lp2.exercicio1;

public abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public abstract Mensagem sendMensagem(String mensagem);

    public String toString(){
        return null;
    }
}
