package br.edu.utfpr.competicao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import br.edu.utfpr.atletas.Atleta;
import br.edu.utfpr.atletas.Ginasta;
import br.edu.utfpr.atletas.Nadador;
import br.edu.utfpr.exceptions.IdadeException;
import br.edu.utfpr.exceptions.LesoesException;

public class SimuladorCompeticao {
	private InscricoesNegadas inscricoesNegadas;
	
	public ResultadoComp simularCompeticao(Competicao competicao) {
		ResultadoComp resultado = new ResultadoComp();
		LocalDate dataAtual = LocalDate.now();
		DesempenhoAtleta melhorDesempenho = null;
		ArrayList<InscricaoNegada> inscricoesNegadasLista = new ArrayList<>();
		int numeroInscricoesNegadas = 0;

		for (Atleta atleta : competicao.getAtletasInscritos()) {
			DesempenhoAtleta desempenho = new DesempenhoAtleta(atleta.getNome());
			atleta.stringToDate();
			Period periodo = Period.between(atleta.getDataNascimentoDate(), dataAtual);
			
			try {
                if (atleta.getQtdLesoes() > 10) {
                    throw new LesoesException();
                } else if (periodo.getYears() > 45) {
                    throw new IdadeException("Idade do atleta é superior ao permitido");
                } else if (periodo.getYears() < 18) {
                    throw new IdadeException("Atleta menor de idade");
                } else {
                	if (atleta instanceof Ginasta) {
    					BigDecimal valor = desempenho.calcularDesempenhoGinasta(atleta);
    					resultado.getDesempenhos().add(desempenho);
    					resultado.setNumeroParticipantes(resultado.getNumeroParticipantes() + 1);
    				} else if (atleta instanceof Nadador) {
    					BigDecimal valor = desempenho.calcularDesempenhoNadador(atleta);
    					resultado.getDesempenhos().add(desempenho);
    					resultado.setNumeroParticipantes(resultado.getNumeroParticipantes() + 1);
    				} else {
    					BigDecimal valor = desempenho.calcularDesempenhoHalterofilista(atleta);
    					resultado.getDesempenhos().add(desempenho);
    					resultado.setNumeroParticipantes(resultado.getNumeroParticipantes() + 1);
    				}
                }
            } catch (LesoesException e) {
            	InscricaoNegada inscricaoNegada = new InscricaoNegada(atleta.getNome(), e.getMessage());
            	numeroInscricoesNegadas++;
            	inscricoesNegadasLista.add(inscricaoNegada);
            } catch (IdadeException e) {
            	InscricaoNegada inscricaoNegada = new InscricaoNegada(atleta.getNome(), e.getMessage());
            	numeroInscricoesNegadas++;
            	inscricoesNegadasLista.add(inscricaoNegada);
            }

		}
		
		InscricoesNegadas inscricoes = new InscricoesNegadas(inscricoesNegadasLista, numeroInscricoesNegadas);
		inscricoesNegadas = inscricoes;

		for (DesempenhoAtleta desempenho : resultado.getDesempenhos()) {
			if (melhorDesempenho == null
					|| desempenho.getDesempenho().compareTo(melhorDesempenho.getDesempenho()) > 0) {
				melhorDesempenho = desempenho;
			}
		}

		resultado.setNomeAtletaCampeao(melhorDesempenho.getNomeAtleta());

		return resultado;
	}

	public InscricoesNegadas getInscricoesNegadas() {
		return inscricoesNegadas;
	}

}
