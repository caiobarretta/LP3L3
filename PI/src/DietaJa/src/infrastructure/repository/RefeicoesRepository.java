package infrastructure.repository;

import java.util.List;

import core.entities.Refeicao;
import core.interfaces.dao.IRefeicoesDAO;
import core.interfaces.dao.base.IDAO;
import core.interfaces.repository.IRefeicoesRepository;
import infrastructure.dao.RefeicoesDAO;
import infrastructure.repository.base.DefaultRepository;

public class RefeicoesRepository extends DefaultRepository<Refeicao> implements IRefeicoesRepository{
	
	protected final IRefeicoesDAO _idao; 
	public RefeicoesRepository() {
		this._idao = new RefeicoesDAO();
	}
	public List<Refeicao> retornaRefeicoesPeloIdDaProcaoDeAlimento(int id){
		return this._idao.retornaRefeicoesPeloIdDaProcaoDeAlimento(id);
    }

	@Override
	public IDAO<Refeicao> getDAO() {
		return this._idao;
	}
}
