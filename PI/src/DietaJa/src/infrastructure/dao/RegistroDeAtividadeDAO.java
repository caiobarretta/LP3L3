package infrastructure.dao;

import java.util.List;

import core.entities.PorcaoDeAlimento;
import core.entities.RegistroDeAtividade;
import core.interfaces.dao.IRegistroDeAtividadeDAO;

public class RegistroDeAtividadeDAO implements IRegistroDeAtividadeDAO {

	@Override
	public List<RegistroDeAtividade> get(int take, int skip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistroDeAtividade get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistroDeAtividade get(RegistroDeAtividade entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegistroDeAtividade> search(RegistroDeAtividade entity, String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(RegistroDeAtividade entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(RegistroDeAtividade entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(RegistroDeAtividade entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PorcaoDeAlimento> retornaProcaoDeAlimentoPeloRegistroDeAtividade(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void associarPorcaoRegistroDeAlimentos(List<Integer> ids, int id) {
		// TODO Auto-generated method stub
		
	}

}
