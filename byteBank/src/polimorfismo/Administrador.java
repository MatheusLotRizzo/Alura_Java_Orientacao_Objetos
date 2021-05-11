package polimorfismo;

public class Administrador extends Funcionario implements Autenticavel {
	private Autenticador autenticador;
	
	public Administrador() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public double getBonicacao() {
		return 50;
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
