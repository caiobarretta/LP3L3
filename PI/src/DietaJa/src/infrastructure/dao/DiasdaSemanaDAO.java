package infrastructure.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import core.entities.DiaDaSemana;
import core.interfaces.dao.IDiasdaSemanaDAO;
import infrastructure.dao.base.DefaultDAO;

public class DiasdaSemanaDAO extends DefaultDAO<DiaDaSemana> implements IDiasdaSemanaDAO{

	@Override
	public void associarDiasDaSemanaRefeicoes(List<Integer> listIdDiasdaSemana, int PorcAlimentoID) {
		String query = "show databases;";
		super.executeQuery(query);
	}

	@Override
	public List<DiaDaSemana> retornarDiaDaSemanaPeloIdDaPorcaoDeAlimento(int id) {
		String query = "show databases;";
		return super.executeQuery(query);
	}

	@Override
	public List<DiaDaSemana> get(int take, int skip) {
		String query = "show databases;";
		return super.executeQuery(query);
	}

	@Override
	public DiaDaSemana get(int id) {
		String query = "show databases;";
		var result = super.executeQuery(query);
		if(result.isEmpty())
			return null;
		return result.get(0);
	}

	@Override
	public DiaDaSemana get(DiaDaSemana entity) {
		String query = "show databases;";
		var result = super.executeQuery(query);
		if(result.isEmpty())
			return null;
		return result.get(0);
	}

	@Override
	public List<DiaDaSemana> search(DiaDaSemana entity, String search) {
		String query = "show databases;";
		return super.executeQuery(query);
	}

	@Override
	public void add(DiaDaSemana entity) {
		String query = "show databases;";
		super.executeQuery(query);
		
	}

	@Override
	public void update(DiaDaSemana entity) {
		String query = "show databases;";
		super.executeQuery(query);
		
	}

	@Override
	public void delete(DiaDaSemana entity) {
		String query = "show databases;";
		super.executeQuery(query);
		
	}

	@Override
	protected List<DiaDaSemana> LoadEntityFromResultSet(ResultSet rs) throws SQLException {
		var result = new ArrayList<DiaDaSemana>();
		while (rs.next()) {
        	String dataBaseName = rs.getString("Database");
        	System.out.println("Database:" + dataBaseName);
        }
		return result;
	}

}
