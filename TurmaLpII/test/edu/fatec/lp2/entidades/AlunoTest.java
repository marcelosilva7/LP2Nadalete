package edu.fatec.lp2.entidades;

import org.junit.Assert;
import org.junit.Test;

public class AlunoTest {
	private Aluno cut;
	
	@Test
	public void validarAlunoSemProvaAtrelada() {
		cut = new Aluno(1, "Aluno 1", "Curso 1", new Prova[]{});
		Assert.assertEquals(0.0, cut.calcularMediaProvas(), 0.0001);
		Assert.assertEquals("1 - Aluno 1", cut.toString());
	}
	
	@Test
	public void validarAlunoCom2Notas() {
		cut = new Aluno(1, "Aluno 1", "Curso 1", new Prova[]{
				new Prova(10.0f, 5.0f),
				new Prova(7.5f, 2.0f)
		});
		Assert.assertEquals(9.2, cut.calcularMediaProvas(), 0.1);
	}
}
