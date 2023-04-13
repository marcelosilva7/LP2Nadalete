package edu.fatec.lp2.exercicio2;

import lombok.Data;

@Data
public class Produto {
   private String nome;

   private String unidade;

   private String descricao;

   private Double preco;

   private Double descontoMaximo;

   private Supermercado supermercado;

   public Produto(Supermercado s){
   }

   public String toString(){
       return this.nome;
   }


   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getUnidade() {
      return unidade;
   }

   public void setUnidade(String unidade) {
      this.unidade = unidade;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public Double getPreco() {
      return preco;
   }

   public void setPreco(Double preco) {
      this.preco = preco;
   }

   public Double getDescontoMaximo() {
      return descontoMaximo;
   }

   public void setDescontoMaximo(Double descontoMaximo) {
      this.descontoMaximo = descontoMaximo;
   }

   public Supermercado getSupermercado() {
      return supermercado;
   }

   public void setSupermercado(Supermercado supermercado) {
      this.supermercado = supermercado;
   }
}

