package HerencaAndConstrutores.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int agencia, int numConta) {
		super(agencia, numConta);
	}
	
	@Override
    public void saca(double valor) throws SaldoInsuficienteException {
        super.saca(valor+0.5);
    }
	
	@Override
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		super.transfere((valor+1), destino);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {	
		return "Conta Corrente "+ super.toString();
	}
}
