package edu.fatec.sjc;

import static com.jcabi.matchers.RegexMatchers.containsPattern;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import edu.fatec.sjc.enums.Naipe;
import edu.fatec.sjc.enums.Valor;


public class BaralhoTest {
	Baralho cut;
	
	@Before
	public void setUp() {
		cut = new Baralho();
	}
	
	@Test
	public void validarQuantidadeCartasBaralhoCheio() {
		cut.embaralhar();
		int cont = 0;
		while(cut.hasCarta()) {
			Carta c = cut.distribuirCarta();
			assertNotNull(c);
			assertThat(Arrays.asList(Naipe.values()), hasItem(c.getNaipe()));
			assertThat(Arrays.asList(Valor.values()), hasItem(c.getValor()));
			cont++;
		}
		assertEquals(56, cont);
	}
	
	@Test
	public void validarRemocaoCartasBaralhoVazio() {
		cut.embaralhar();
		while(cut.hasCarta()) {
			cut.distribuirCarta();
		}
		assertFalse(cut.hasCarta());
		assertNull(cut.distribuirCarta());
		
	}
	
	@Test
	public void validarImpressaoCartasBatalho() {
		cut.embaralhar();
		assertThat(cut.imprimirBaralho(), containsPattern("Naipe = ([A-Za-z0-9])\\w+ \\| Valor = ([A-Za-z0-9])\\w+"));
	}
}
