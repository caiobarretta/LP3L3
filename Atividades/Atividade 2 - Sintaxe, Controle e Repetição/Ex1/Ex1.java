package LP3;

import java.util.Random;
import java.util.Scanner;


public class Ex1 {

	
	public static boolean validaNumero(int num, int rnd) {
		if(num > rnd) {
			System.out.println("Menor.");
			return false;
		}
		if(num < rnd) {
			System.out.println("Maior.");
			return false;
		}
		System.out.println("Acertou.");
		return true;
	}
	
	public static void main(String[] args) {
		Random rnd = new Random(); //Inicia Aleatório
		int x = rnd.nextInt(100); //Gera um número aleatório (0 – 99)
		
		boolean acertou = false;
		do {
		System.out.println("Entre com o número entre (0-99) para a adivinhação: ");
		
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		if(numero <0 || numero > 99)
			System.out.println("O número: " + numero + "é inválido!");
		else
			acertou = validaNumero(numero, x);
		
		}while(!acertou);
		
	}

}
