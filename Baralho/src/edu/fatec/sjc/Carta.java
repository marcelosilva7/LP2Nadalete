package edu.fatec.sjc;

import edu.fatec.sjc.enums.Naipe;
import edu.fatec.sjc.enums.Valor;

public class Carta {
	private Naipe naipe;
	private Valor valor;
	
	public Carta(Naipe n, Valor v) {
		naipe = n;
		valor = v;
	}
	
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("Naipe = ");
		sb.append(getNaipe().toString());
		sb.append(" | ");
		sb.append("Valor = ");
		sb.append(getValor());
		return sb.toString();
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public Valor getValor() {
		return valor;
	}
}
