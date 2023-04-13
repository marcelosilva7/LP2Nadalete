package edu.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem {
    private Integer duracao;

    @Override
    public Mensagem sendMensagem(String mensagem) {
        return this;
    }
}
