package polimorfismo;

public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		return super.getBonicacao() + 100;
	}
	
	public double getBonicacao() {
		System.out.println("Chamou bonificação Editor Video");
		return super.getSalario() + 1000;
	}
	
}
