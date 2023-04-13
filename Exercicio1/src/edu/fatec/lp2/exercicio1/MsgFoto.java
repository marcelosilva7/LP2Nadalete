package edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem {
    private Integer tamanho;

    @Override
    public Mensagem sendMensagem(String mensagem) {
        return this;
    }
}
