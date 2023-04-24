package edu.fatec.sjc.enums;

import java.util.ArrayList;
import java.util.List;

public enum Naipe {
	OURO, PAUS, COPAS, ESPADA, CORINGA;
	
	public static Naipe[] getValues() {
		List<Naipe> listaRetorno = new ArrayList<>();
		for (Naipe v : Naipe.values()) {
			if (v != CORINGA)
				listaRetorno.add(v);
		}
		return listaRetorno.toArray(new Naipe[listaRetorno.size()]);
	}
}
