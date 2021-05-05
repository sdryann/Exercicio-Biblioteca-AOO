package entities;

public class Professor extends Pessoa {

	int codigo;
	
	public Professor(String nome, int codigo){
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
