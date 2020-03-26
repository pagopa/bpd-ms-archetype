package ${package}.${msPackageName};

import ${package}.${msPackageName}.model.entity.DummyEntity;
import eu.sia.meda.connector.jpa.JPAConnectorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
class DummyDAOImpl extends JPAConnectorImpl<DummyEntity, java.io.Serializable> implements DummyDAO {//FIXME: remove me (created as archetype test)

    @Autowired
    public DummyDAOImpl(EntityManager em) {
        super(DummyEntity.class, em);
    }

}