//Crie um programa que instancie duas carteiras e teste-as.
public class Programa {

	public static void main(String[] args) {
		
		var carteira1 = new Carteira(500);
		System.out.println("Pode Pagar?: " + carteira1.podePagar(100));
		
		var carteira2 = new Carteira(50);
		System.out.println("Pode Pagar?: " + carteira2.podePagar(100));
	}

}
