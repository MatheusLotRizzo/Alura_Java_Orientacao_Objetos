package polimorfismo;

public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		return super.getSalario() + 100;
	}
	
	public double getBonicacao() {
		System.out.println("Chamou bonifica��o Editor Video");
		return super.getSalario() + 1000;
	}
	
}
