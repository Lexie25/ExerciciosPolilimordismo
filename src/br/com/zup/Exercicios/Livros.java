package br.com.zup.Exercicios;

public class Livros extends Item{

	private String autor;
	private int paginas;
	public Livros(String nome, String categoria, String autor, int paginas) {
		super(nome, categoria);
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

	@Override

	public String toString() {

		String modelo = "";
		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "Categoria -> " + super.getCategoria() + "\n";
		modelo += "Autor -> " + this.getAutor() + "\n";
		modelo += "Paginas -> " + this.getPaginas() + "\n";
		return modelo;


	}
}