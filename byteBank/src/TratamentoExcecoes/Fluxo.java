package TratamentoExcecoes;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        
        try {
            metodo2();
        }catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exception "+msg);
        	ex.printStackTrace();
        }catch(Exception e) { //pega qualquer exceção
        	String msg = e.getMessage();
        	System.out.println("Exception "+msg);
        }
        
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcecao("deu ruim");
        
        //System.out.println("Fim do metodo2");
    }
}

