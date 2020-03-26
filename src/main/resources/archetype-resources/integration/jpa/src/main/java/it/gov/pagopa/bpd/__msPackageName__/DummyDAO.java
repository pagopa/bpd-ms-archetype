package ${package}.${msPackageName};

import ${package}.${msPackageName}.model.entity.DummyEntity;
import eu.sia.meda.connector.jpa.JPAConnector;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DummyDAO extends JPAConnector<DummyEntity, java.io.Serializable> {//FIXME: remove me (created as archetype test)

}
