package byteBank;

public class Conta {
	double saldo;
	int agencia;
	String titular;
	
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
	
}


