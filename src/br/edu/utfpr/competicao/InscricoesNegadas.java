package br.edu.utfpr.competicao;

import java.util.ArrayList;

public class InscricoesNegadas {

	private int numeroInscricoesNegadas;
	private ArrayList<InscricaoNegada> inscricoesNegadas = new ArrayList<>();

	public InscricoesNegadas(ArrayList<InscricaoNegada> inscricoesNegadas, int numeroInscricoesNegadas) {
		super();
		this.inscricoesNegadas = inscricoesNegadas;
		this.numeroInscricoesNegadas = numeroInscricoesNegadas;
	}

	public ArrayList<InscricaoNegada> getInscricoesNegadas() {
		return inscricoesNegadas;
	}

	public void setInscricoesNegadas(ArrayList<InscricaoNegada> inscricoesNegadas) {
		this.inscricoesNegadas = inscricoesNegadas;
	}

	public int getNumeroInscricoesNegadas() {
		return numeroInscricoesNegadas;
	}

	public void setNumeroInscricoesNegadas(int numeroInscricoesNegadas) {
		this.numeroInscricoesNegadas = numeroInscricoesNegadas;
	}

}
