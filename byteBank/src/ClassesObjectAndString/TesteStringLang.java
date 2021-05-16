package ClassesObjectAndString;

public class TesteStringLang {

	public static void main(String[] args) {
		
		//Object literal
		String nome = "Matheus";
		System.out.println(nome);
		
		String nome2 = nome.replace("a", "A");
		System.out.println(nome2);
		
		System.out.println("-------------------");
		System.out.println(nome2.toUpperCase());
		System.out.println(nome2.toLowerCase());
		
		System.out.println("-------------------");
		char c = nome.charAt(2); //letra na posição 2 da string
		System.out.println(c);
		
		System.out.println("-------------------");
		int pos = nome.indexOf("he"); //posição onde começa o he
		System.out.println(pos);
		
		System.out.println("-------------------");
		String sub = nome.substring(1); //String a partir da pos 1;
		System.out.println(sub);
		
		System.out.println("-------------------");
		System.out.println("Tamanho: "+nome.length()); //tamanho String
		/*
		for(int i = 0; i <= nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}*/
		
		System.out.println("-------------------");
		String vazio = " ";
		String vazioTrim = vazio.trim(); //retira espaços da String
		System.out.println("Vazio com espaço: "+vazio.isEmpty()); //verifica se ta vazio
		System.out.println("Passando com Trim: "+vazioTrim.isEmpty());
		
		System.out.println("-------------------");
		String teste = "Matheus";
		System.out.println(teste.contains("th")); //Contem th? true
		
	}

}
