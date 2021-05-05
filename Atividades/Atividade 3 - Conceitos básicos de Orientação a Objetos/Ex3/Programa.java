/*
 * Identifique possíveis classes, campos e métodos neste trecho de documento de requisitos:
 * “O usuário deve preencher um formulário contendo nome, RG, CPF e endereço do imóvel a ser anunciado. Ao
 * pressionar o botão "Enviar", será mostrada uma tela de verificação dos dados, onde será possível confirmar ou
 * cancelar o anúncio. O sistema deverá registrar a data e hora em que o anúncio tiver sido publicado, em caso de
 * confirmação.”
 */
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var usuario = new Usuario("Nome", "RG", "CPF");
		var anuncio = new Anuncio("Endereço Imóvel", usuario);
		
		//Se confirmado
		anuncio.ConfirmarAnuncio();
		
	}

}
