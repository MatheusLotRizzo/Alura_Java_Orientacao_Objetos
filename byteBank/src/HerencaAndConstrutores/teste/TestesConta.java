package HerencaAndConstrutores.teste;
import HerencaAndConstrutores.modelo.CalculadorImposto;
import HerencaAndConstrutores.modelo.ContaCorrente;
import HerencaAndConstrutores.modelo.ContaPoupanca;
import HerencaAndConstrutores.modelo.SaldoInsuficienteException;
import HerencaAndConstrutores.modelo.SeguroVida;

/**
 *  Classe Teste de chamadas das contas
 * @author Matheus Rizzo
 * @version 0.1
 */

public class TestesConta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(9125, 9922);
		cc.deposita(100);
		
		
		ContaPoupanca cp = new ContaPoupanca(9125, 9923);
		cp.deposita(200);
		
		cc.transfere(150, cp);
		
		System.out.println("cc: "+cc.getSaldo());
		System.out.println("cp: "+cp.getSaldo());
		
		cc.saca(9);
		System.out.println(cc.getSaldo());
		
		SeguroVida seguro = new SeguroVida();
		CalculadorImposto imposto = new CalculadorImposto();
		imposto.registra(cc);
		System.out.println(imposto.getValorImposto());
	}
}
