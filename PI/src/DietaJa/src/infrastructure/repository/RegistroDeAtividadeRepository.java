package infrastructure.repository;

import java.util.List;

import core.entities.PorcaoDeAlimento;
import core.entities.RegistroDeAtividade;
import core.interfaces.dao.IRegistroDeAtividadeDAO;
import core.interfaces.dao.base.IDAO;
import core.interfaces.repository.IRefeicoesRepository;
import core.interfaces.repository.IRegistroDeAtividadeRepository;
import infrastructure.dao.RegistroDeAtividadeDAO;
import infrastructure.repository.base.DefaultRepository;

public class RegistroDeAtividadeRepository extends DefaultRepository<RegistroDeAtividade> implements IRegistroDeAtividadeRepository {
	
	protected final IRegistroDeAtividadeDAO _idao;
	public RegistroDeAtividadeRepository() {
		this._idao = new RegistroDeAtividadeDAO();
	}
	
	public void associarPorcaoRegistroDeAlimentos(List<Integer> lstIdPorcaoDeAlimento, int id){
		this._idao.associarPorcaoRegistroDeAlimentos(lstIdPorcaoDeAlimento, id);
    }

    public List<PorcaoDeAlimento> retornaProcaoDeAlimentoPeloRegistroDeAtividade(int id){
    	return this._idao.retornaProcaoDeAlimentoPeloRegistroDeAtividade(id);
    }

	@Override
	public IDAO<RegistroDeAtividade> getDAO() {
		return this._idao;
	}
}
