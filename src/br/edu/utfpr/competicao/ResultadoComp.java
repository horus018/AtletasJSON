package br.edu.utfpr.competicao;

import java.util.ArrayList;

public class ResultadoComp {
	private String nomeAtletaCampeao;
	private int numeroParticipantes;
	private ArrayList<DesempenhoAtleta> desempenhos = new ArrayList<>();

	public ResultadoComp() {
		super();
	}

	public String getNomeAtletaCampeao() {
		return nomeAtletaCampeao;
	}

	public void setNomeAtletaCampeao(String nomeAtleta) {
		this.nomeAtletaCampeao = nomeAtleta;
	}

	public int getNumeroParticipantes() {
		return numeroParticipantes;
	}

	public void setNumeroParticipantes(int numeroParticipantes) {
		this.numeroParticipantes = numeroParticipantes;
	}

	public ArrayList<DesempenhoAtleta> getDesempenhos() {
		return desempenhos;
	}
	
}
