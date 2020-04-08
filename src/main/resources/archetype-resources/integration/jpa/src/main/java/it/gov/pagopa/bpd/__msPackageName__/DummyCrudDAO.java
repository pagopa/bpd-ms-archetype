package ${package}.${msPackageName};

import ${package}.${msPackageName}.model.entity.DummyEntity;
import eu.sia.meda.connector.jpa.CrudJpaDAO;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyCrudDAO extends CrudJpaDAO<DummyEntity, java.io.Serializable> {//FIXME: remove me (created as archetype test)

}
