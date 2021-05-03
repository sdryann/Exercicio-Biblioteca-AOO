package entities;

public class Professor extends Pessoa {

	int codigo;
	
	public Professor(String name, int codigo){
		super(name);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	

}
