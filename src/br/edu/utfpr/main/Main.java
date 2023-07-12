package br.edu.utfpr.main;

import br.edu.utfpr.atletas.Ginasta;
import br.edu.utfpr.atletas.Halterofilista;
import br.edu.utfpr.atletas.Nadador;
import br.edu.utfpr.competicao.Competicao;
import br.edu.utfpr.competicao.InscricoesNegadas;
import br.edu.utfpr.competicao.ResultadoComp;
import br.edu.utfpr.competicao.SimuladorCompeticao;
import br.edu.utfpr.manipularjson.ManipuladorJson;

public class Main {
	public static void main(String[] args) {
		ManipuladorJson manipuladorJson = new ManipuladorJson();
		Competicao competicao = new Competicao();
		SimuladorCompeticao simuladorCompeticao = new SimuladorCompeticao();
		
		for (Ginasta atleta : manipuladorJson.lerArquivoGinastas()) {
			competicao.registrarAtleta(atleta);
		}
		ResultadoComp resultado = simuladorCompeticao.simularCompeticao(competicao);
		manipuladorJson.escreverResultado(resultado, "ginastas");
		InscricoesNegadas inscricoesNegadas = simuladorCompeticao.getInscricoesNegadas();
		manipuladorJson.escreverInscricoesNegadas(inscricoesNegadas, "ginastas");
		
		competicao = new Competicao();
		for (Nadador atleta : manipuladorJson.lerArquivoNadador()) {
			competicao.registrarAtleta(atleta);
		}
		resultado = simuladorCompeticao.simularCompeticao(competicao);
		manipuladorJson.escreverResultado(resultado, "nadadores");
		inscricoesNegadas = simuladorCompeticao.getInscricoesNegadas();
		manipuladorJson.escreverInscricoesNegadas(inscricoesNegadas, "nadadores");
		
		competicao = new Competicao();
		for (Halterofilista atleta : manipuladorJson.lerArquivoHalterofilista()) {
			competicao.registrarAtleta(atleta);
		}
		resultado = simuladorCompeticao.simularCompeticao(competicao);
		manipuladorJson.escreverResultado(resultado, "halterofilistas");
		inscricoesNegadas = simuladorCompeticao.getInscricoesNegadas();
		manipuladorJson.escreverInscricoesNegadas(inscricoesNegadas, "halterofilistas");
	}
}
