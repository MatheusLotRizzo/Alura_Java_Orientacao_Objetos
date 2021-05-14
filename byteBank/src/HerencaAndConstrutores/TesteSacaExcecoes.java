package HerencaAndConstrutores;

public class TesteSacaExcecoes {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		try {
		conta.deposita(200);
		conta.saca(300);
		}catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Operação Finalizada");
		
		
	}

}
