package edu.fatec.sjc.enums;

import java.util.ArrayList;
import java.util.List;

public enum Valor {
	AIS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, DAMA, VALETE, REIS, CORINGA;
	
	public static Valor[] getValues() {
		List<Valor> listaRetorno = new ArrayList<>();
		for (Valor v : Valor.values()) {
			if (v != CORINGA)
				listaRetorno.add(v);
		}
		return listaRetorno.toArray(new Valor[listaRetorno.size()]);
	}
}
