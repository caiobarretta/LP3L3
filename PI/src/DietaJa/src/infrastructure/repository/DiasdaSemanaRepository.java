package infrastructure.repository;

import java.util.List;

import core.entities.DiaDaSemana;
import core.interfaces.dao.IDiasdaSemanaDAO;
import core.interfaces.dao.base.IDAO;
import core.interfaces.repository.IDiasdaSemanaRepository;
import infrastructure.dao.DiasdaSemanaDAO;
import infrastructure.repository.base.DefaultRepository;

public class DiasdaSemanaRepository extends DefaultRepository<DiaDaSemana> implements IDiasdaSemanaRepository {
	
	protected final IDiasdaSemanaDAO _idao;
	public DiasdaSemanaRepository() {
		this._idao = new DiasdaSemanaDAO();
	}
	
	public void associarDiasDaSemanaRefeicoes(List<Integer> listIdDiasdaSemana, int PorcaoAlimentoID){
		this._idao.associarDiasDaSemanaRefeicoes(listIdDiasdaSemana, PorcaoAlimentoID);
    }

    public List<DiaDaSemana> retornarDiaDaSemanaPeloIdDaPorcaoDeAlimento(int id){
    	return this._idao.retornarDiaDaSemanaPeloIdDaPorcaoDeAlimento(id);
    }

	@Override
	public IDAO<DiaDaSemana> getDAO() {
		return this._idao; 
	}
}
