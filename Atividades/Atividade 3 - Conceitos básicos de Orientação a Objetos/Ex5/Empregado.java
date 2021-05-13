/*A fim de representar empregados em uma firma, crie uma classe chamada Empregado 
 
*/
public class Empregado {
	// que inclui as três informações a seguir como atributos:
	//• um primeiro nome
	private String primeiroNome;
	//• um sobrenome, e
	private String sobrenome;
	//• um salário mensal
	private double salarioMensal;

	//Sua classe deve ter um construtor que inicializa os três atributos.
	public Empregado(String primeiroNome, String sobreNome, double salarioMensal) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobreNome;
		//Se o salário mensal não for positivo, configure-o como 0.0.
		if(salarioMensal < 0) this.salarioMensal = 0;
		else this.salarioMensal = salarioMensal;
	}
	
	public void aplicaAumento(double valor) throws Exception {
		if(valor <= 0) {
			throw new Exception("Não é possível aplicar um percentual negativo");
		}
		this.salarioMensal *= 1 + (valor/100);
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}
	
	public String getNomeCompleto() {
		return primeiroNome + " " + sobrenome;
	}
}
