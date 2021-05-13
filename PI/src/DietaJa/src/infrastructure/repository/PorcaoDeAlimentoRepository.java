package infrastructure.repository;

import java.util.List;
import core.entities.PorcaoDeAlimento;
import core.interfaces.dao.IPorcaoDeAlimentoDAO;
import core.interfaces.dao.base.IDAO;
import core.interfaces.repository.IPorcaoDeAlimentoRepository;
import infrastructure.dao.PorcaoDeAlimentoDAO;
import infrastructure.repository.base.DefaultRepository;

public class PorcaoDeAlimentoRepository extends DefaultRepository<PorcaoDeAlimento> implements IPorcaoDeAlimentoRepository{
	
	protected final IPorcaoDeAlimentoDAO _idao;
	public PorcaoDeAlimentoRepository() {
		this._idao = new PorcaoDeAlimentoDAO();
	}
	
	
	public void associarPorcaoAlimentoDieta(List<Integer> listIdProcaoAlimento, int idDieta){
		this._idao.associarPorcaoAlimentoDieta(listIdProcaoAlimento, idDieta);
    }

    public void associarPorcaoRefeicoes(List<Integer> listIdRefeicao, int idPorcaoDeAlimento){
    	this._idao.associarPorcaoRefeicoes(listIdRefeicao, idPorcaoDeAlimento);
    }

    @Override
    public PorcaoDeAlimento get(int id){
    	return this._idao.get(id);
    }

    public List<PorcaoDeAlimento> retornaPorcaoDeAlimentoPeloIdDaDieta(int id){
    	return this._idao.retornaPorcaoDeAlimentoPeloIdDaDieta(id);
    }

    @Override
    public PorcaoDeAlimento get(PorcaoDeAlimento entity){
    	return this._idao.get(entity);
    }

	@Override
	public IDAO<PorcaoDeAlimento> getDAO() {
		return this._idao;
	}
}