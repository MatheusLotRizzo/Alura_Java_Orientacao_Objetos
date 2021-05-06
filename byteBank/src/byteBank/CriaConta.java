package byteBank;

public class CriaConta {

	public static void main(String[] args) {
		/*
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 12345;
		primeiraConta.titular = "Matheus Lot Rizzo";
		
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.titular);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		segundaConta.agencia = 9999;
		segundaConta.titular = "Joaquim da Silva";
		
		System.out.println(segundaConta.saldo);
		System.out.println(segundaConta.agencia);
		System.out.println(segundaConta.titular);
		
		Conta terceiraConta = primeiraConta;
		System.out.println(terceiraConta.saldo);
		System.out.println(terceiraConta.agencia);
		System.out.println(terceiraConta.titular);
		*/
	
		/*
		Conta conta = new Conta();
		conta.saldo = 300;
		conta.deposita(500);
		System.out.println(conta.saldo);
		
		
		boolean saqueok = conta.saca(500);
		System.out.println(saqueok);
		System.out.println(conta.saldo);
		
		Conta conta = new Conta();
		conta.saldo = 300;
		conta.deposita(500);
		*/
		
		Conta contaMatheus = new Conta();
		contaMatheus.deposita(1000);
		
		Conta contaLot = new Conta();
		
		contaMatheus.transfere(550, contaLot);
		System.out.println("---------//------------");
		System.out.println(contaLot.saldo);
		
	}

}
