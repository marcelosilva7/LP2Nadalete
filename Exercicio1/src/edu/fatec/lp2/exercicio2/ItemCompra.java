package edu.fatec.lp2.exercicio2;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class ItemCompra implements Calculavel{
    private Integer quantidade;

    private Produto produto;

    private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if(desconto <= produto.getDescontoMaximo()){
            this.desconto = desconto;
        }
    }

    @Override
    public double calcularPreco(){
        double descontoItem = ((produto.getPreco() * desconto)/100);
        double precoNovo = produto.getPreco() - descontoItem;
        produto.setPreco(precoNovo);
        return precoNovo;
    }

}
