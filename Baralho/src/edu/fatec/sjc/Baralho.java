package edu.fatec.sjc;

import edu.fatec.sjc.enums.Naipe;
import edu.fatec.sjc.enums.Valor;

public class Baralho {
	private static final int NR_EMBARALHADAS = 100;
	
	private Carta[] cartas;
	private int nrCartas = 56;
	
	public Baralho() {
		setCartas(new Carta[nrCartas]);
		int i = 0;
		for(Naipe n : Naipe.getValues()) {
			for (Valor v : Valor.getValues()) {
				getCartas()[i++] = new Carta(n, v);
			}
		}
		while(i < 56) {
			getCartas()[i++] = new Carta(Naipe.CORINGA, Valor.CORINGA);
		}
	}
	
	public void embaralhar() {
		for (int i = 1; i < NR_EMBARALHADAS; i++) {
			int index1 = (int)(Math.random()*nrCartas);
			int index2 = (int)(Math.random()*nrCartas);
			Carta aux = getCartas()[index1];
			getCartas()[index1] = getCartas()[index2];
			getCartas()[index2] = aux;
		} 
	}
	
	public Carta distribuirCarta() {
		if(nrCartas != 0)
			return getCartas()[--nrCartas];
		else
			return null;
	}
	
	public boolean hasCarta() {
		return nrCartas != 0;
	}
	
	public String imprimirBaralho() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nrCartas; i++) {
			sb.append(getCartas()[i].imprimir()).append("\n");
		}
		return sb.toString();
	}

	private Carta[] getCartas() {
		return this.cartas;
	}
	
	private void setCartas(Carta[] c) {
		this.cartas = c;
	}
}
