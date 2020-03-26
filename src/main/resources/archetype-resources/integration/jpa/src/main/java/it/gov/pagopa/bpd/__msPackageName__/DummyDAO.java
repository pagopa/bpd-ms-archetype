package it.gov.pagopa.bpd.${msPackageName};

import it.gov.pagopa.bpd.${msPackageName}.model.entity.DummyEntity;
import eu.sia.meda.connector.jpa.JPAConnector;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DummyDAO extends JPAConnector<DummyEntity, java.io.Serializable> {//FIXME: remove me (created as archetype test)

}
