package Request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestBasic {

	//usando o HttpURLConnection Java SE 8 - biblioteca mais simples do java

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("deprecation")
		//quando passo URL ele ja considera que é GET pois é padrao da biblioteca
		URL url = new URL("https://viacep.com.br/ws/03527904/json/");

		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		InputStream is = con.getInputStream();

		//aqui crio o objeto da biblioteca ResponseCode e printo.
		int statusCode = con.getResponseCode();
		System.out.println(statusCode);

		//aqui uso o BufferRead que le o arquivo que recebo qnd faco o get
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		reader.close();
		//aqui construo ele para printar.
		String jsonString = sb.toString();
		System.out.printf(jsonString);
	}
}