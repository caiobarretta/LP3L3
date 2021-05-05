import java.time.LocalDate;

// endereço do imóvel a ser anunciado. Ao pressionar o botão "Enviar", será mostrada uma tela de verificação dos 
// dados, onde será possível confirmar ou cancelar o anúncio. O sistema deverá registrar a data e hora em que o 
// anúncio tiver sido publicado, em caso de confirmação.
public class Anuncio {
	private String enderecoImovel;
	private LocalDate dataPublicacao;
	private boolean confirmado;
	private Usuario usuario;
	
	public Anuncio(String enderecoImovel, Usuario usuario) {
		this.enderecoImovel = enderecoImovel;
		this.confirmado = false;
		this.usuario = usuario;
	}
	
	public void ConfirmarAnuncio() {
		dataPublicacao = LocalDate.now();
		confirmado = true;
	}
}
