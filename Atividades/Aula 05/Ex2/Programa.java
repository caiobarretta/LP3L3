import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a frase:");
		String frase = scanner.nextLine();
		
		System.out.println("Caracter de pesquisa:");
		char pesquisa = scanner.next().charAt(0);
		
		int index = frase.indexOf(pesquisa);
		System.out.println("frase: " + frase);
		int count = 0;
		
		if(index < 0){
			System.out.println("A quantidade de caracteres encontrados foi: " + count);
			return;
		}
		
		count++;
		StringBuilder sb = new StringBuilder(frase);
		sb.deleteCharAt(index);
		
		while(index >= 0){
			index = sb.indexOf(String.valueOf(pesquisa));
			if(index >= 0){
				count++;
				sb.deleteCharAt(index);
			}
		};
		
		System.out.println("A quantidade de caracteres encontrados foi: " + count);
	}

}
