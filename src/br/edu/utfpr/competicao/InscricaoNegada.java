package br.edu.utfpr.competicao;

public class InscricaoNegada {
	private String nomeAtleta;
	private String motivo;

	public InscricaoNegada(String nomeAtleta, String motivo) {
		super();
		this.nomeAtleta = nomeAtleta;
		this.motivo = motivo;
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public void setNomeAtleta(String nomeAtleta) {
		this.nomeAtleta = nomeAtleta;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}
