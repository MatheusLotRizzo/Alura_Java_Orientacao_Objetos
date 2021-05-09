package HerencaAndConstrutores;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numConta;
	private Cliente titular;
	private static int totalContas;
	
	public Conta(int agencia, int numConta) {
		if(agencia < 0) {
			System.out.println("Número da agência ou conta inválido");
			return;
		}else {
			this.agencia = agencia;
			this.numConta = numConta;
			Conta.totalContas++;
		}
	}
	
	public static int getTotalContas() {
		return Conta.totalContas;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia < 0) {
			System.out.println("Número da agencia inválido");
			return;
		}else {
			this.agencia = agencia;
		}
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(int numConta) {
		if(numConta < 0) {
			System.out.println("Número da conta inválido");
			return;
		}else {
			this.numConta = numConta;
		}
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public abstract void deposita(double valor);
	
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

