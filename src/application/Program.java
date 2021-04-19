package application;

import entities.Autor;
import entities.Professor;
import entities.Aluno;
import entities.Livro;

public class Program {

	public static void main(String[] args) {
	
	Autor autor1 = new Autor("Stephen Hawking", "Reino Unido");
	Autor autor2 = new Autor("Stephen Covey", "Estados Unidos");
	
	Aluno aluno1 = new Aluno("Rian Sousa", 420);
	Professor prof1 = new Professor("Efra�n Andres", 690);
	
	Livro livro1 = new Livro("Uma breve hist�ria do tempo", autor1);
	livro1.setEmprestadoPor(autor1);

	Livro livro2 = new Livro("Os 7 h�bitos das pessoas altamente eficazes", autor2);
	livro2.setEmprestadoPor(prof1);
	
	System.out.println(livro1.toString());
	System.out.println(livro2.toString());
	
	
	
	}

}
