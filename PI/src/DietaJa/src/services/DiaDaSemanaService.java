package services;

import java.util.List;

import core.entities.DiaDaSemana;
import core.interfaces.service.IDiasdaSemanaService;
import infrastructure.repository.base.DefaultRepository;
import services.base.DefaultService;

public class DiaDaSemanaService extends DefaultService<DiaDaSemana> implements IDiasdaSemanaService{
	
	public void associarDiasDaSemanaRefeicoes(List<Integer> listIdDiasdaSemana, int PorcAlimentoId) {
		//TODO : Implementar
        throw new UnsupportedOperationException("Implementar");
	}

    public List<DiaDaSemana> retornarDiaDaSemanaPeloIdDaPorcaoDeAlimento(int id){
    	//TODO : Implementar
        throw new UnsupportedOperationException("Implementar");
    }
}
