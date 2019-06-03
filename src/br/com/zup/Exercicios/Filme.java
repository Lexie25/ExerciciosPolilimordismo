package br.com.zup.Exercicios;
import java.util.ArrayList;
import java.util.List;
public class Filme extends Item{

	private String genero;
	private String duracao;
	
	private List<String> Atores = new ArrayList<String>();

	public Filme(String nome, String categoria, String genero, String duracao, List<String> atores) {
		super(nome, categoria);
		this.genero = genero;
		this.duracao = duracao;
		Atores = atores;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public List<String> getAtores() {
		return Atores;
	}

	public void setAtores(List<String> atores) {
		Atores = atores;
	}

	}

