package HerencaAndConstrutores;

public class TestesConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(9125, 9922);
		cc.deposita(100);
		
		/*
		ContaPoupanca cp = new ContaPoupanca(9125, 9923);
		cp.deposita(200);
		
		cc.transfere(150, cp);
		
		System.out.println("cc: "+cc.getSaldo());
		System.out.println("cp: "+cp.getSaldo());
		
		cc.saca(9);
		System.out.println(cc.getSaldo());*/
		
		SeguroVida seguro = new SeguroVida();
		CalculadorImposto imposto = new CalculadorImposto();
		imposto.registra(cc);
		imposto.registra(seguro);
		System.out.println(imposto.getValorImposto());
	}

}
