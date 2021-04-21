package LP3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex2 {
	
	public static ArrayList<Integer> calculaFibonacci(int n) {
		ArrayList<Integer> sequencia = new ArrayList();
		sequencia.add(0);
		sequencia.add(1);
		
		int x1 = 0;
		int x2 = 0;
		int i = 1;
		while(n>x1+x2) {
			x1 =  sequencia.get(i-1);
			x2 = sequencia.get(i);
			sequencia.add(x1+x2);
			i++;
		}
		return sequencia;
	}

	public static void imprimeArrayListInteger(ArrayList<Integer> arr) {
		for(int i=1; i<arr.size(); i++)
			System.out.print(arr.get(i) + " ");
		System.out.println("");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Entre com o número para o cálculo da sequência de Fibonacci: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		imprimeArrayListInteger(calculaFibonacci(numero));
	}

}
