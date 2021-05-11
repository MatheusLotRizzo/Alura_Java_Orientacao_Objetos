package polimorfismo;

public class Administrador extends Funcionario implements Autenticavel {
	private String senha;
	
	@Override
	public double getBonicacao() {
		return 50;
	}	
	
	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(String senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
}
