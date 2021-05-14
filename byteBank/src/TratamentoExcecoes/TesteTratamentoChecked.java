package TratamentoExcecoes;

public class TesteTratamentoChecked {

	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			System.out.println("teste");
			c.deposita();
		}catch(MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Tratamento "+msg);
		}

	}

}
