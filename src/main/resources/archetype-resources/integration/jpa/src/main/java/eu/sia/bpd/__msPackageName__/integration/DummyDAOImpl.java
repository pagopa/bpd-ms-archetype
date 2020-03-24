package eu.sia.bpd.${msPackageName}.integration;

import eu.sia.bpd.${msPackageName}.model.DummyEntity;
import eu.sia.meda.connector.jpa.JPAConnectorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
class DummyDAOImpl extends JPAConnectorImpl<DummyEntity, java.io.Serializable> implements DummyDAO {

    @Autowired
    public PaymentMethodDAOImpl(EntityManager em) {
        super(DummyEntity.class, em);
    }

}