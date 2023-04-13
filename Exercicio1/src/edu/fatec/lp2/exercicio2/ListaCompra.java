package edu.fatec.lp2.exercicio2;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
public class ListaCompra implements Calculavel {
    private List<ItemCompra> itemCompras = new LinkedList<ItemCompra>();

    private int quantidadeMax = 10;

    public ListaCompra(int quantidadeMax){
        this.quantidadeMax = quantidadeMax;
    }

    public void incluir(ItemCompra item){
        if(quantidadeMax <= itemCompras.size()){
            itemCompras.add(item);
        }
    }
    @Override
    public double calcularPreco() {
        double precos = 0;
        for(ItemCompra item:itemCompras){
            double preco = item.getProduto().getPreco();
            precos+= preco;
        } return precos;
    }
}

