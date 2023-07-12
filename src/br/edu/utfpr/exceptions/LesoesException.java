package br.edu.utfpr.exceptions;

@SuppressWarnings("serial")
public class LesoesException extends RuntimeException {
	public LesoesException() { 
		super("Atleta com excesso de lesões");
	}
}
