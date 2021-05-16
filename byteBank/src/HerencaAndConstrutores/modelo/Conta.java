package HerencaAndConstrutores.modelo;

import javax.sql.rowset.spi.TransactionalWriter;

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
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente. "
					+ "Saldo Atual: " + this.saldo 
					+ " Valor tentado reitrar: " + valor);
		}
		
		this.saldo -= valor;
		System.out.println("Retire o Money");
		System.out.println("Seu saldo é de R$ "+this.saldo);
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);	
		destino.deposita(valor);
		System.out.println("Transferido com sucesso o valor de R$ "+valor);
		System.out.println("Seu saldo é de R$ "+this.saldo);
	}
}

