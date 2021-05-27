package JavaUtil.Arrays;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {
		
		int idades[] = new int[3];
		
		idades[0] = 10;
		idades[1] = 20;
		idades[2] = 30;
		
		
		for(int i=0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		System.out.println("tamanho Array: "+idades.length);

	}

}
