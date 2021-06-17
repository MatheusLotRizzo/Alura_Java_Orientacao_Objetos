package JavaIO;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
		
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			
			Scanner linhascan = new Scanner(linha);
			
			linhascan.useDelimiter(",");
			linhascan.useLocale(Locale.US);
			
			String tipoConta = linhascan.next();
			int agencia = linhascan.nextInt();
			int conta = linhascan.nextInt();
			String titular = linhascan.next();
			double saldo = linhascan.nextDouble();
			
			String valorformatado = 
				String.format(new Locale("pt","BR"),
					"%s %03d-%04d %s: %.2f %n",
					tipoConta,agencia,conta,titular,saldo);
			
			System.out.println(valorformatado);
			
			linhascan.close();
		}
		
		scanner.close();
	}

}
