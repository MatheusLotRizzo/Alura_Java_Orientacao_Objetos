package TratamentoExcecoes;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        
        try {
            metodo2();
        }catch(ArithmeticException | NullPointerException ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exce��o"+msg);
        	ex.printStackTrace();
        }/*catch(NullPointerException ex) {
        	ex.printStackTrace();
        }*/catch (Exception ex) {
			
		}
        
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //int a = i/0;
            try {
            	Conta c = null;
            	c.deposita();
            }catch (Exception e) {
				e.printStackTrace();
			}
        }
        System.out.println("Fim do metodo2");
    }
}

