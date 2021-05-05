//Crie uma classe chamada Carteira para representar carteiras de dinheiro.
public class Carteira {
	//Acrescente um campo “saldo” (double) 
	private double saldo;
	//e um construtor que receba o valor inicial de saldo.
	public Carteira(double valorInicialSaldo) {
		this.saldo = valorInicialSaldo;
	}
	//Acrescente um método booleano podePagar, que servirá para verificar se aquela carteira consegue pagar um 
	//determinado valor (ou seja, se tem saldo disponível). Esse método podePagar deve receber 
	//um parâmetro preço e retornar true se a carteira tiver saldo suficiente. 
	public boolean podePagar(double valor) {
		if(valor <= this.saldo) return true;
		else return false;
	}
	
}
