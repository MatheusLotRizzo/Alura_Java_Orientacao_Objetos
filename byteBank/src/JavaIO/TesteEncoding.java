package JavaIO;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "13� �rg�o Oficial";
		System.out.println(s.codePointAt(0));
		
		System.out.println(Charset.defaultCharset().displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + ", UTF-16");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", US-ASCII");
		sNovo = new String(bytes);
		System.out.println(sNovo);
	}

}
