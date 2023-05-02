package edu.fatec.lp2.entidades;

public class Turma2 {

	public boolean excluir(String nome) {
		for(int i = 0; i < index; i++) {
			Aluno aluno = alunos[i];
			if(aluno.getnome().equals(nome)) {
				alunos[i] = null;
				for(int j = i +1; j < index; j ++) {
					alunos[j -1] = alunos[j]
				}
				alunos[--index] = null;
				return true;
			}
		}
		return false;
	}
