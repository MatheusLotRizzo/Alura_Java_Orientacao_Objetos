package HerencaAndConstrutores;

public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numConta) {
		super(agencia, numConta);
	}
	
	@Override
    public boolean saca(double valor) {
        return super.saca(valor+0.5);
    }
	
	@Override
	public boolean transfere(double valor, Conta destino) {
		return super.transfere((valor+1), destino);
	}
}
