package byteBank;

public class Conta {
	double saldo;
	int agencia;
	int numConta;
	Cliente titular;
	
	public void deposita(double valor){
		this.saldo+=valor; 
	}
	
	public boolean saca(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Retire o Money");
			return true;
		}else {
			System.out.println("Valor Indiponível");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Transferido com sucesso o valor de R$ "+valor);
			System.out.println("Seu saldo é de R$ "+this.saldo);
			return true;
		}else {
			System.out.println("Saldo insuficiente.");
			System.out.println("Seu saldo é de R$ "+this.saldo);
			return false;
		}
	}
}


