package br.com.zup.modelo;

public class Musica {
	
	private String cantor;
	private String banda;
	private String genero;
	
	
   public void Musica(String cantor, String banda, String genero) {
		this.cantor = cantor;
		this.banda = banda;
		this.genero = genero;
	}


	public String getCantor() {
		return cantor;
	}


	public void setCantor(String cantor) {
		this.cantor = cantor;
	}


	public String getBanda() {
		return banda;
	}


	public void setBanda(String banda) {
		this.banda = banda;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Musica(String cantor, String banda, String genero) {
		super();
		this.cantor = cantor;
		this.banda = banda;
		this.genero = genero;
	}
	
	


}
