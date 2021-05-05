//Escreva um aplicativo de teste que demonstra as capacidades da classe Fatura.
public class Teste {

	public static void main(String[] args) {
		var fatura = new Fatura(1, "Mouse", 1, (float)50.00);
		System.out.println("Valor da Fatura: " + fatura.getValorDaFatura());
		
		var fatura1 = new Fatura(2, "Teclado", 2, (float)100.00);
		System.out.println("Valor da Fatura: " + fatura1.getValorDaFatura());
		
		var fatura2 = new Fatura(3, "Monitor", 3, (float)700.00);
		System.out.println("Valor da Fatura: " + fatura2.getValorDaFatura());
		
		var fatura3 = new Fatura(4, "Fone de ouvido", 4, (float)20.00);
		System.out.println("Valor da Fatura: " + fatura3.getValorDaFatura());

	}

}
