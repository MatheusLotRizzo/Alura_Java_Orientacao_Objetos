package JavaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintWriterAndPrintStream {

	public static void main(String[] args) throws IOException {
		
		//FileWriter fw = new FileWriter("teste2.txt");
        
		PrintStream ps = new PrintStream("teste2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println("fdfsadsadsadasdasdas");
        ps.close();
        
        PrintWriter pw = new PrintWriter("teste3.txt");
        pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        pw.println("fdfsadsadsadasdasdas");
        pw.close();
        
	}
}
