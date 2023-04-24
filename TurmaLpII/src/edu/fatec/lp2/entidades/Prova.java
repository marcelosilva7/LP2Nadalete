package edu.fatec.lp2.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Prova {
	private float nota;
	private float peso;
	
	public float calcularNotaProva() {
		return getNota() * getPeso();
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	
	
}
