package br.edu.utfpr.atletas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Atleta {
	protected String nome;
	protected transient LocalDate dataNascimentoDate;
	protected String dataNascimento;
	protected BigDecimal peso;
	protected BigDecimal flexibilidade;
	protected BigDecimal resistencia;
	protected BigDecimal folego;
	protected BigDecimal forca;
	protected int qtdLesoes;

	private void dateToString() {
		String dataStr = dataNascimentoDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.dataNascimento = dataStr;
	}

	public void stringToDate() {
		LocalDate localDate = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.dataNascimentoDate = localDate;
	}

	abstract void competir();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getFlexibilidade() {
		return flexibilidade;
	}

	public void setFlexibilidade(BigDecimal flexibilidade) {
		this.flexibilidade = flexibilidade;
	}

	public BigDecimal getResistencia() {
		return resistencia;
	}

	public void setResistencia(BigDecimal resistencia) {
		this.resistencia = resistencia;
	}

	public BigDecimal getFolego() {
		return folego;
	}

	public void setFolego(BigDecimal folego) {
		this.folego = folego;
	}

	public BigDecimal getForca() {
		return forca;
	}

	public void setForca(BigDecimal forca) {
		this.forca = forca;
	}

	public int getQtdLesoes() {
		return qtdLesoes;
	}

	public void setQtdLesoes(int qtdLesoes) {
		this.qtdLesoes = qtdLesoes;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataNascimentoDate() {
		return dataNascimentoDate;
	}

	public void setDataNascimentoDate(LocalDate dataNascimentoDate) {
		this.dataNascimentoDate = dataNascimentoDate;
	}

}
