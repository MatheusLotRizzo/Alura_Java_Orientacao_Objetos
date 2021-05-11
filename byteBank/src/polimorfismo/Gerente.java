package polimorfismo;

public class Gerente extends Funcionario implements Autenticavel {
	private String senha;
	
	public double getBonicacao() {
		System.out.println("Chamou bonificação Gerente");
		return super.getSalario() * 2;
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
