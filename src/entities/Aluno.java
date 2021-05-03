package entities;

public class Aluno extends Pessoa {

	int codigo;
	
	public Aluno(String nome, int codigo){
		super(nome);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
