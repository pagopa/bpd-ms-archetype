package eu.sia.bpd.${msPackageName}.integration;

import eu.sia.bpd.${msPackageName}.model.DummyEntity;
import eu.sia.meda.connector.jpa.JPAConnector;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DummyDAO extends JPAConnector<DummyEntity, java.io.Serializable> {

}
