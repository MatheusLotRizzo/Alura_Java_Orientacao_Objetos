package HerencaAndConstrutores;

public class CalculadorImposto implements Tributavel {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	@Override
	public double getValorImposto() {
		return totalImposto;
	}
}
