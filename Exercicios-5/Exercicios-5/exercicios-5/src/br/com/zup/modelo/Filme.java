package br.com.zup.modelo;

import java.util.ArrayList;

public class Filme extends Item {
	
   public Filme(String nome, String categoria) {
		super(nome, categoria);
		
	} private String Genero;
	   private int duracao;
	   private ArrayList<String> atores = new ArrayList();
	   
public Filme(String nome, String categoria, String genero, int duracao, ArrayList<String> atores) {
	super(nome, categoria);
	Genero = genero;
	this.duracao = duracao;
	this.atores = atores;
}

public String getGenero() {
	return Genero;
}

public void setGenero(String genero) {
	Genero = genero;
}

public int getDuracao() {
	return duracao;
}

public void setDuracao(int duracao) {
	this.duracao = duracao;
}

public ArrayList<String> getAtores() {
	return atores;
}

public void setAtores(ArrayList<String> atores) {
	this.atores = atores;
}
  
   

}
