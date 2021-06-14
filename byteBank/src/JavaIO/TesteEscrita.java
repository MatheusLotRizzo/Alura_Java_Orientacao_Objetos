package JavaIO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//Criando Arquivos e escrevendo neles
		OutputStream fos = new FileOutputStream("teste2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Adicionando uma nova linha no arquivo");
		bw.newLine();
		bw.write("Adicionando uma nova linha no arquivo 2");		
		bw.close();
	}
}
