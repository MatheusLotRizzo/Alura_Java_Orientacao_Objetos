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
		
		/*
		Conta contaMatheus = new Conta();
		contaMatheus.deposita(1000);
		
		Conta contaLot = new Conta();
		
		contaMatheus.transfere(550, contaLot);
		System.out.println("---------//------------");
		System.out.println(contaLot.saldo);
		*/
		
		//Ligando conta ao cliente
		/*
		Cliente matheus = new Cliente();
		matheus.nome="Matheus Lot Rizzo";
		matheus.cpf="222.222.222-22";
		matheus.profissao="Dev junior";
		
		Conta contaMatheus = new Conta();
		contaMatheus.deposita(100);
		
		contaMatheus.titular = matheus;
		System.out.println(contaMatheus.titular.nome);
		System.out.println(contaMatheus.getSaldo());
		
		Conta contaLot = new Conta();
		contaLot.titular = new Cliente();
		contaLot.titular.nome = "LotRz";
		System.out.println(contaLot.titular.nome);
		*/
		
		//usando getters e setters e construtor e variavel static 
		
		Conta conta = new Conta(1337, 9922);
		
		Cliente contaLot = new Cliente();
		contaLot.setNome("Matheus Lot");
		conta.setTitular(contaLot);
		
		Conta conta2 = new Conta(1337, 9923);
		Conta conta3 = new Conta(1337, 9924);
		Conta conta4 = new Conta(1337, 9925);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Dev Junior");
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumConta());
		System.out.println(Conta.getTotalContas());
				
	}

}
