package edu.fatec.lp2.entidades;

import org.junit.Assert;
import org.junit.Test;

public class ProvaTest {
	private Prova cut;
	
	@Test
	public void validarCalculoNotaProva() {
		cut = new Prova(10.0f, 5.0f);
		Assert.assertEquals(50.0, cut.calcularNotaProva(), 0.1);
	}
}
