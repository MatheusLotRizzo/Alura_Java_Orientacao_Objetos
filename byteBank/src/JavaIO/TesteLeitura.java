package JavaIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com arquivo	
		InputStream fis = new FileInputStream("teste.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader bfr = new BufferedReader(isr);
		
		String linha = bfr.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = bfr.readLine();
		}
		bfr.close();
	}
}
