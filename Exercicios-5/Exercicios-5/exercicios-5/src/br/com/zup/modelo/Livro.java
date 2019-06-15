package br.com.zup.modelo;

public class Livro extends Item  {
	
	private String autor;
	private int paginas;
	
	public void Livro(String autor, int paginas) {
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public Livro(String nome, String categoria, String autor, int paginas) {
		super(nome, categoria);
		this.autor = autor;
		this.paginas = paginas;
	}

	

	
}
