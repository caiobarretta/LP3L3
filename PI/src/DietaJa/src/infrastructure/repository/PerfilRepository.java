package infrastructure.repository;

import core.entities.Perfil;
import core.interfaces.dao.IPerfilDAO;
import core.interfaces.dao.base.IDAO;
import core.interfaces.repository.IPerfilRepository;
import infrastructure.dao.PerfilDAO;
import infrastructure.repository.base.DefaultRepository;

public class PerfilRepository extends DefaultRepository<Perfil> implements IPerfilRepository {

	protected final IPerfilDAO _idao;
	
	public PerfilRepository() {
		this._idao = new PerfilDAO();
	}
	@Override
	public IDAO<Perfil> getDAO() {
		return this._idao;
	}

}
