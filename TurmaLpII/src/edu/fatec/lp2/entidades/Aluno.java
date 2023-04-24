package edu.fatec.lp2.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Aluno {

	private int matricula;
	private String nome;
	private String curso;
	private Prova provas[];
	
	@Override
	public String toString() {
		return String.valueOf(getMatricula()) + " - " + getNome();
	}
	
	public float calcularMediaProvas() {
		float notaAcumulada = 0f;
		for (Prova prova : provas) {
			notaAcumulada += prova.calcularNotaProva();
		}
		return getSomaPesos() == 0.0f ? 0.0f : notaAcumulada / getSomaPesos();
	}
	
	private float getSomaPesos() {
		float somaPesos = 0.0f;
		for (Prova prova : provas) {
			somaPesos += prova.getPeso();
		}
		return somaPesos;
	}
	
	
}
