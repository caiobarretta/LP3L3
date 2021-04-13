import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Entre com o valor do salário: ");
		
		Scanner scanner = new Scanner(System.in);
		float salario = scanner.nextFloat();
		int desc = descontoComBaseNoSalario(salario);
		
		System.out.println("O desconto do INSS é: " + ((desc == 0)? "Isento" : desc + "%"));
	}
	
	private static int descontoComBaseNoSalario(float sal) {
		if(sal <= 600) {
			return 0;
		}
		else if(sal > 600 && sal <= 1200) {
			return 20;
		}
		else if(sal > 1200 && sal <= 2000) {
			return 25;
		}
		else{
			return 30;
		}
	}

}
