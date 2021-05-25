package JavaUtil;

import HerencaAndConstrutores.modelo.Cliente;
import HerencaAndConstrutores.modelo.Conta;
import HerencaAndConstrutores.modelo.ContaCorrente;
import HerencaAndConstrutores.modelo.ContaPoupanca;
import HerencaAndConstrutores.modelo.SeguroVida;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		/*
		ContaCorrente contas[] = new ContaCorrente[3];
		//ContaCorrente cc1 = new ContaCorrente(10, 10);
		
		contas[0] = new ContaCorrente(10, 10);
		contas[1] = new ContaCorrente(11, 11);
		contas[2] = new ContaCorrente(12, 12);
		
		for(int i=0; i < contas.length; i++) {	
			double vlrdeposito = contas[i].getNumConta() + 100;
			contas[i].deposita(vlrdeposito);
			System.out.println(contas[i]);
			System.out.println("Saldo: R$ "+contas[i].getSaldo());
			System.out.println("-----------//-----------");
		}	
		*/
		
		Conta contas[] = new Conta[3];
		contas[0] = new ContaCorrente(10, 10);
		contas[1] = new ContaCorrente(11, 11);
		contas[2] = new ContaPoupanca(12, 12);
		
		for(int i=0; i < contas.length; i++) {	
			double vlrdeposito = contas[i].getNumConta() + 100;
			contas[i].deposita(vlrdeposito);
			System.out.println(contas[i]);
			System.out.println("Saldo: R$ "+contas[i].getSaldo());
			System.out.println("-----------//-----------");
		}	
		
		//Mais generica possivel, aceita qualquer tipo de referencia
		Object ref[] = new Object[3];
		ref[0] = new ContaCorrente(10, 10);
		ref[1] = new Cliente();
		ref[2] = new SeguroVida();
		
	} 
}
