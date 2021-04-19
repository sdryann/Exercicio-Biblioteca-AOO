package entities;

public class Aluno extends Pessoa {

	int codigo;
	
	public Aluno(String nome, int codigo){
		super(nome);
		this.codigo = codigo;
	}

}
