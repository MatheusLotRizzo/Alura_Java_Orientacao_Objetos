package polimorfismo;

public class Cliente implements Autenticavel{
	private Autenticador autenticador;
	
	public Cliente() {
		this.autenticador = new Autenticador();
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
