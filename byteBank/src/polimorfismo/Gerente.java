package polimorfismo;

public class Gerente extends Funcionario {
	private String senha;
	
	public Gerente() {
		
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public double getBonicacao() {
		System.out.println("Chamou bonificação Gerente");
		return super.getSalario() * 2;
	}
	
	public boolean autentica(String senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
}
