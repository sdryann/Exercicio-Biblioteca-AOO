package entities;
import entities.Autor;

public class Livro {

	String nome;
	Autor autor;
	Pessoa emprestadoPor;
	
	public Livro(String nome, Autor autor) {
		this.nome = nome;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
	
	
	
}
