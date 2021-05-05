// Crie uma classe chamada Fatura que possa ser utilizado por uma loja de suprimentos de informática para representar 
// uma fatura de um item vendido na loja. 
public class Fatura {
	//Uma fatura deve incluir as seguintes informações como atributos:
	// • o número do item faturado
	private int numeroItemFaturado;
	// • a descrição do item
	private String descricao;
	// • a quantidade comprada do item
	private int quantidade;
	// • o preço unitário do item
	private float preco;
	
	// Sua classe deve ter um construtor que inicialize os quatro atributos.
	public Fatura(int numeroItemFaturado, String descricao, int quantidade, float preco) {
		this.numeroItemFaturado = numeroItemFaturado;
		this.descricao = descricao;
	 // Se a quantidade não for positiva, ela deve ser configurada como 0. 
		if(quantidade < 0) this.quantidade = 0;
		else this.quantidade = quantidade;
	 // Se o preço por item não for positivo ele deve ser configurado como 0.0.
		if(preco < 0) this.preco = 0;
		else this.preco = preco;
	}
	
	// Além disso, forneça um método chamado getValorDaFatura que calcula o valor da fatura 
	public double getValorDaFatura() {
		//(isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um double.
		return this.quantidade * preco;
	}
}
