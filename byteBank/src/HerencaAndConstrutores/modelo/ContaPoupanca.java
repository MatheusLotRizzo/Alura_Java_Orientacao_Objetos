package HerencaAndConstrutores.modelo;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numConta) {
		super(agencia, numConta);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}
	
	@Override
	public String toString() {
		return "Conta Poupança "+ super.toString();
	}
}
