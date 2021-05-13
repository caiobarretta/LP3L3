//Escreva um aplicativo de teste que demonstra as capacidades da classe. 
public class Programa {

	private static int _QuantidadeDeMesesNoAno = 12;
	public static void main(String[] args) {
		//Crie duas instâncias da classe e exiba o salário anual de cada instância. 
		var empregado1 = new Empregado("Maria", "José", 10000);
		ImprimeSalarioEmpregado(empregado1);
		var empregado2 = new Empregado("José", "Maria", 20000);
		ImprimeSalarioEmpregado(empregado2);
		
		//Então dê a cada empregado um aumento de 10% 
		try {
			empregado1.aplicaAumento((double)10);
			empregado2.aplicaAumento((double)10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//e exiba novamente o salário anual de cada empregado.
		ImprimeSalarioEmpregado(empregado1);
		ImprimeSalarioEmpregado(empregado2);
	}
	
	public static void ImprimeSalarioEmpregado(Empregado empregado) {
		var nomeCompleto = empregado.getNomeCompleto();
		var salarioAnual =  empregado.getSalarioMensal() * _QuantidadeDeMesesNoAno;
		System.out.println("O salário Anual do funcionário: " + nomeCompleto +" é: " + salarioAnual);
	}

}
