package ${package}.${msPackageName}.connector.jpa;

import ${package}.${msPackageName}.connector.jpa.model.DummyEntity;
import it.gov.pagopa.bpd.common.connector.jpa.CrudJpaDAO;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyDAO extends CrudJpaDAO<DummyEntity, java.io.Serializable> {//FIXME: remove me (created as archetype test)

}
