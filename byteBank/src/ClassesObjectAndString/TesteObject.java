package ClassesObjectAndString;

import HerencaAndConstrutores.modelo.ContaCorrente;
import HerencaAndConstrutores.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(22, 13);
		ContaPoupanca cp = new ContaPoupanca(23, 14);
		
		System.out.println(cc);
		System.out.println(cp);
		
		//printl(true);
	}
	
	/*Exemplo sobrecarga*/
	static void printl() {}
	
	static void printl(int a) {}
	
	static void printl(boolean valor) {}
	
	static void printl(Object referencia) {}
	
}
