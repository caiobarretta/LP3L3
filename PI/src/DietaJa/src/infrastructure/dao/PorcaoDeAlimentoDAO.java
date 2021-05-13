package infrastructure.dao;

import java.util.List;

import core.entities.PorcaoDeAlimento;
import core.interfaces.dao.IPorcaoDeAlimentoDAO;

public class PorcaoDeAlimentoDAO implements IPorcaoDeAlimentoDAO{

	@Override
	public List<PorcaoDeAlimento> get(int take, int skip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PorcaoDeAlimento get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PorcaoDeAlimento get(PorcaoDeAlimento entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PorcaoDeAlimento> search(PorcaoDeAlimento entity, String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(PorcaoDeAlimento entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PorcaoDeAlimento entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PorcaoDeAlimento entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void associarPorcaoRefeicoes(List<Integer> listIdRefeicao, int porcaoDeAlimentoID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void associarPorcaoAlimentoDieta(List<Integer> listIdProcaoAlimento, int dietaID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PorcaoDeAlimento> retornaPorcaoDeAlimentoPeloIdDaDieta(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
