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

	public Pessoa getEmprestadoPor() {
		return emprestadoPor;
	}

	public void setEmprestadoPor(Pessoa emprestadoPor) {
		this.emprestadoPor = emprestadoPor;
	}

	
	public String toString() {
		return "Livro [" + nome + "]\n Autor: " + autor.nome + "\n Nacionalidade: "+ autor.nacional +"\n Emprestado por: " + emprestadoPor.nome + "\n";
	}
	
	
	
	
	
	
}
