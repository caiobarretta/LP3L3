package infrastructure.repository;

import core.entities.Usuario;
import core.interfaces.dao.IUsuarioDAO;
import core.interfaces.dao.base.IDAO;
import core.interfaces.repository.IUsuarioRepository;
import infrastructure.dao.UsuarioDAO;
import infrastructure.repository.base.DefaultRepository;

public class UsuarioRepository extends DefaultRepository<Usuario> implements IUsuarioRepository{
	
	protected final IUsuarioDAO _idao;
	public UsuarioRepository() {
		this._idao = new UsuarioDAO();
	}
	public boolean isUsuario(String usuario, String senha, int CodigoUsuario){
		return this._idao.isUsuario(usuario, senha, CodigoUsuario);
    }

	@Override
	public IDAO<Usuario> getDAO() {
		return this._idao;
	}
}
