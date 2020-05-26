package ${package}.${msPackageName}.dao;

import ${package}.${msPackageName}.dao.model.DummyEntity;
import eu.sia.meda.connector.jpa.CrudJpaDAO;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyDAO extends CrudJpaDAO<DummyEntity, java.io.Serializable> {//FIXME: remove me (created as archetype test)

}
