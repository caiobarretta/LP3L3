package infrastructure.repository.base;

import java.util.List;
import core.entities.base.Entity;
import core.interfaces.dao.base.IDAO;
import core.interfaces.repository.base.IRepository;

public abstract class DefaultRepository<TEntity extends Entity> implements IRepository<TEntity>{

	public void add(TEntity entity){
		this.getDAO().add(entity);
    }

    public void delete(TEntity entity){
    	this.getDAO().delete(entity);
    }

    public List<TEntity> get(int take, int skip){
    	return this.getDAO().get(take, skip);
    }

    public TEntity get(int id){
    	return this.getDAO().get(id);
    }

    public TEntity get(TEntity entity){
    	return this.getDAO().get(entity);
    }

    public List<TEntity> search(TEntity entity, String search){
    	return this.getDAO().search(entity, search);
    }

    public void update(TEntity entity){
    	getDAO().update(entity);
    }
    
    public abstract IDAO<TEntity> getDAO();
}
