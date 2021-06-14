package JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("teste.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader bfr = new BufferedReader(isr);
		
		OutputStream fos = new FileOutputStream("teste3.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = bfr.readLine();
		while(linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = bfr.readLine();
		}
		bfr.close();
		bw.close();
	}
}
