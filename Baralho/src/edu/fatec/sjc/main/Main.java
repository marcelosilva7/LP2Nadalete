package edu.fatec.sjc.main;

import edu.fatec.sjc.Baralho;
import edu.fatec.sjc.Carta;

public class Main {

	public static void main(String[] args) {
		Baralho b = new Baralho();
		b.embaralhar();
		while (b.hasCarta()) {
			Carta c = b.distribuirCarta();
			if (c != null)
				c.imprimir();
		}

	}

}
