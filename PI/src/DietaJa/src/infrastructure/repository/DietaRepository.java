package infrastructure.repository;

import core.entities.Dieta;
import core.interfaces.dao.IDietaDAO;
import core.interfaces.dao.base.IDAO;
import infrastructure.dao.DietaDAO;
import infrastructure.repository.base.DefaultRepository;

public class DietaRepository extends DefaultRepository<Dieta>{

	protected final IDietaDAO _idao;
	public DietaRepository() {
		this._idao = new DietaDAO();
		
	}
	@Override
	public IDAO<Dieta> getDAO() {
		return _idao;
	}

}
