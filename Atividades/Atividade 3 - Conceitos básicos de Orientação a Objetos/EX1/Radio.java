/*
 * Crie uma classe denominada Radio com um atributo do tipo inteiro denominado “volume” e
 * um do tipo ponto flutuante denominado “frequencia”. Defina o construtor da classe Radio
 * de forma que o usuário deva passar os valores dos atributos ao criar um objeto. Também
 * defina um método para exibir o volume e a frequência sintonizada.
 * */


public class Radio {
	private int volume;
	private float frequencia;
	
	public Radio(int volume, int frequencia){
		this.volume = volume;
		this.frequencia = frequencia;
	}
	
	public void ExibirVolumeEFrequencia() {
		System.out.println("volume: " + this.volume +"DB");
		System.out.println("frequência: " + this.frequencia + " MHZ");
	}
	
	
}
