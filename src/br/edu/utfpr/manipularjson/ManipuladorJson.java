package br.edu.utfpr.manipularjson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import br.edu.utfpr.atletas.Ginasta;
import br.edu.utfpr.atletas.Halterofilista;
import br.edu.utfpr.atletas.Nadador;
import br.edu.utfpr.competicao.InscricoesNegadas;
import br.edu.utfpr.competicao.ResultadoComp;

public class ManipuladorJson {
    private Gson gson;

    public ManipuladorJson() {
        gson = new Gson();
    }

    public List<Ginasta> lerArquivoGinastas() {
        List<Ginasta> ginastas = new ArrayList<>();
        try {
            Reader leitor = new FileReader("ginastas.json");
            ginastas = gson.fromJson(leitor, new TypeToken<List<Ginasta>>(){}.getType());
            leitor.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler arquivo de ginastas.json: " + e.getMessage());
        }
        return ginastas;
    }

    public List<Nadador> lerArquivoNadador() {
        List<Nadador> nadadores = new ArrayList<>();
        try {
            Reader leitor = new FileReader("nadadores.json");
            nadadores = gson.fromJson(leitor, new TypeToken<List<Nadador>>(){}.getType());
            leitor.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler arquivo de nadadores.json: " + e.getMessage());
        }
        return nadadores;
    }

    public List<Halterofilista> lerArquivoHalterofilista() {
        List<Halterofilista> halterofilistas = new ArrayList<>();
        try {
            Reader leitor = new FileReader("halterofilistas.json");
            halterofilistas = gson.fromJson(leitor, new TypeToken<List<Halterofilista>>(){}.getType());
            leitor.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler arquivo de halterofilistas.json: " + e.getMessage());
        }
        return halterofilistas;
    }

    public void escreverResultado(ResultadoComp resultados, String tipoAtletismo) {
    	gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Writer writer = new FileWriter("resultados-" + tipoAtletismo + ".json");
            gson.toJson(resultados, writer);
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }
    
    public void escreverInscricoesNegadas(InscricoesNegadas inscricoesNegadas, String tipoAtletismo) {
    	gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Writer writer = new FileWriter("inscricoes-negadas-" + tipoAtletismo + ".json");
            gson.toJson(inscricoesNegadas, writer);
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }
}
