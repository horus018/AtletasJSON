package br.edu.utfpr.competicao;

import java.util.ArrayList;

import br.edu.utfpr.atletas.Atleta;

public class Competicao {
	private ArrayList<Atleta> atletasInscritos = new ArrayList<>();

	public Competicao() {
		super();
	}

	public ArrayList<Atleta> getAtletasInscritos() {
		return atletasInscritos;
	}
	
	public void registrarAtleta(Atleta atleta) {
		this.atletasInscritos.add(atleta);
	}

}
