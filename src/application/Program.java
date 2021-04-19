package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Autor;
import entities.Professor;
import entities.Aluno;
import entities.Livro;

public class Program {

	public static void main(String[] args) {
	
	Autor autor1 = new Autor("Stephen Hawking", "Reino Unido");
	Autor autor2 = new Autor("Stephen Covey", "Estados Unidos");
	
	Aluno aluno1 = new Aluno("Rian Sousa", 420);
	Professor prof1 = new Professor("Efraín Andres", 690);
	
	Livro livro1 = new Livro("Uma breve história do tempo", autor1);
	

	}

}
