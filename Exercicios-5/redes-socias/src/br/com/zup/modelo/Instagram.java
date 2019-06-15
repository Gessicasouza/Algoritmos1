package br.com.zup.modelo;

public class Instagram extends RedeSocial{

	private int numerosDeStories;

	public Instagram(String nomeUsuario, int numerosCurtidas, int numerosCompartilhamentos, int numerosDeStories) {
		super(nomeUsuario, numerosCurtidas, numerosCompartilhamentos);
		this.numerosDeStories = numerosDeStories;
	}

	public int getNumerosDeStories() {
		return numerosDeStories;
	}

	public void setNumerosDeStories(int numerosDeStories) {
		this.numerosDeStories = numerosDeStories;
	}
	
	
}
