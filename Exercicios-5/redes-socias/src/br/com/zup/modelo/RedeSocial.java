package br.com.zup.modelo;

public class RedeSocial {
	
	//Atributos
	private String nomeUsuario;
	private int numerosCurtidas;
	private int numerosCompartilhamentos;
	
	
	//Construtor
	public RedeSocial(String nomeUsuario, int numerosCurtidas, int numerosCompartilhamentos) {
		
		super();
		this.nomeUsuario = nomeUsuario;
		this.numerosCurtidas = numerosCurtidas;
		this.numerosCompartilhamentos = numerosCompartilhamentos;
		
		 }
    //Getters and Setters
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getNumerosCurtidas() {
		return numerosCurtidas;
	}
	public void setNumerosCurtidas(int numerosCurtidas) {
		this.numerosCurtidas = numerosCurtidas;
	}
	public int getNumerosCompartilhamentos() {
		return numerosCompartilhamentos;
	}
	public void setNumerosCompartilhamentos(int numerosCompartilhamentos) {
		this.numerosCompartilhamentos = numerosCompartilhamentos;
	}
	
	//Método
	public String darLike() {
		String like = "Curtindo..."; 
		return like;
	}
	
	public String darLike(String nomeUsuario) {
		String nomeUsuario = "";
		return nomeUsuario;
	}
	
	public String compartilhar() {
		String compartilhar = "";
		return compartilhar;
	}
	
}	