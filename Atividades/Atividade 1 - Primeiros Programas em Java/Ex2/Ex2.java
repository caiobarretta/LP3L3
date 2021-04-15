import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {		
		System.out.println("Entre com o os carateres para conversão: ");
		
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		String textoUsuario = scanner.next();
		String textoConvertido = converteStringEmDigitosDoTecladoDeCelular(textoUsuario);
		
		System.out.println(textoConvertido);
		
	}
	
	public static String converteStringEmDigitosDoTecladoDeCelular(String texto){
		Map<String, String> dicionario = new HashMap<String, String>();
		CarregaDicionario(dicionario);
		String textoConvertido = "";
		for(char t: texto.toCharArray()) {
			textoConvertido += dicionario.get(String.valueOf(t));
		}
		return textoConvertido;
	}
	
	public static void CarregaDicionario(Map<String, String> dicionario) {
		dicionario.put(".", "1");
		dicionario.putAll(CarregaCaracteresTabelaUnicode('a', 'c', "2"));
		dicionario.putAll(CarregaCaracteresTabelaUnicode('d', 'f', "3"));
		dicionario.putAll(CarregaCaracteresTabelaUnicode('g', 'i', "4"));
		dicionario.putAll(CarregaCaracteresTabelaUnicode('j', 'l', "5"));
		dicionario.putAll(CarregaCaracteresTabelaUnicode('m', 'o', "6"));
		dicionario.putAll(CarregaCaracteresTabelaUnicode('p', 's', "7"));
		dicionario.putAll(CarregaCaracteresTabelaUnicode('t', 'v', "8"));
		dicionario.putAll(CarregaCaracteresTabelaUnicode('w', 'z', "9"));
		dicionario.put(" ", "0");
	}
	
	public static Map<String, String> CarregaCaracteresTabelaUnicode(char inicio, char fim, String valor){
		Map<String, String> dict = new HashMap<String, String>();
		
		for(int i = (int)inicio; i<= (int)fim; i++) {
			dict.put((String.valueOf((char)i)), valor);
		}
		return dict;
	}
}
