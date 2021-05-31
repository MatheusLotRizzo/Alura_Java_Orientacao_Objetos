package JavaUtil.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.intValue());
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		List<Number> lista = new ArrayList<Number>();
		lista.add(10);
		lista.add(20.5);
		lista.add(25.6f);
		
		for (Number number : lista) {
			System.out.println(number);
		}
	}
}
