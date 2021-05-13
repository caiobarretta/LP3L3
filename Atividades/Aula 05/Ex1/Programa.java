import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o o número no formato:(XXX)XXX-XXXX");
		String numero = scanner.nextLine();
		
		numero = numero.replace("(", "");
		numero = numero.replace(")", "-");
		String[] tokens = numero.split("-");
		String numeroTelefone = tokens[1] + tokens[1];
		
		System.out.println("código de área: " + tokens[0]);
		System.out.println("número de telefone: " + numeroTelefone);

	}

}
