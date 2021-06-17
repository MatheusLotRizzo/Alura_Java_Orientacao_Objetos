package JavaIO;

import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("teste2.txt");
        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        fw.write(System.lineSeparator());
        fw.write("asfasdfsafdas dfs sdf asf assdﬂ");

        fw.close();
	}
}
