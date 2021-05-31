package JavaUtil.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingAndUnboxing {

	public static void main(String[] args) {
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		Integer idade = Integer.valueOf(29); //autoBoxing
		int valor = idade.intValue(); //unboxing
		
		System.out.println(idade.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		 
		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //AutiBoxing

	}

}
