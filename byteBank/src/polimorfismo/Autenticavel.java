package polimorfismo;

public abstract interface Autenticavel{
		
	public abstract void setSenha(String senha);
	
	public abstract boolean autentica(String senha);
}
