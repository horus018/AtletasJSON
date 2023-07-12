package br.edu.utfpr.competicao;

import java.math.BigDecimal;

import br.edu.utfpr.atletas.Atleta;

public class DesempenhoAtleta {
	private String nomeAtleta;
	private BigDecimal desempenho;

	public DesempenhoAtleta(String nomeAtleta) {
		super();
		this.nomeAtleta = nomeAtleta;
	}

	public BigDecimal calcularDesempenhoGinasta(Atleta atleta) {
		this.desempenho = new BigDecimal("1").add(atleta.getForca().multiply(new BigDecimal("0.6")))
				.add(atleta.getResistencia().multiply(new BigDecimal("0.6")))
				.add(atleta.getFolego().multiply(new BigDecimal("0.5")))
				.add(atleta.getFlexibilidade().multiply(new BigDecimal("1.0")))
				.subtract(atleta.getPeso().divide(new BigDecimal("100")))
				.subtract(new BigDecimal(atleta.getQtdLesoes()).divide(new BigDecimal("10")));
		return this.desempenho;
	}

	public BigDecimal calcularDesempenhoNadador(Atleta atleta) {
		this.desempenho = new BigDecimal("1").add(atleta.getForca().multiply(new BigDecimal("0.5")))
				.add(atleta.getResistencia().multiply(new BigDecimal("0.6")))
				.add(atleta.getFolego().multiply(new BigDecimal("1.0")))
				.add(atleta.getFlexibilidade().multiply(new BigDecimal("0.3")))
				.subtract(atleta.getPeso().divide(new BigDecimal("100")))
				.subtract(new BigDecimal(atleta.getQtdLesoes()).divide(new BigDecimal("10")));
		return this.desempenho;
	}

	public BigDecimal calcularDesempenhoHalterofilista(Atleta atleta) {
		this.desempenho = new BigDecimal("1").add(atleta.getForca().multiply(new BigDecimal("1.0")))
				.add(atleta.getResistencia().multiply(new BigDecimal("0.6")))
				.add(atleta.getFolego().multiply(new BigDecimal("0.4")))
				.add(atleta.getFlexibilidade().multiply(new BigDecimal("0.3")))
				.subtract(atleta.getPeso().divide(new BigDecimal("100")))
				.subtract(new BigDecimal(atleta.getQtdLesoes()).divide(new BigDecimal("10")));
		return this.desempenho;
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public void setNomeAtleta(String nomeAtleta) {
		this.nomeAtleta = nomeAtleta;
	}

	public BigDecimal getDesempenho() {
		return desempenho;
	}
	
	
}
