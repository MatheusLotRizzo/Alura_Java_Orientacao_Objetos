package polimorfismo;

public class Gerente extends Funcionario implements Autenticavel {
	private Autenticador autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	public double getBonicacao() {
		System.out.println("Chamou bonificação Gerente");
		return super.getSalario() * 2;
	}

	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}
}
