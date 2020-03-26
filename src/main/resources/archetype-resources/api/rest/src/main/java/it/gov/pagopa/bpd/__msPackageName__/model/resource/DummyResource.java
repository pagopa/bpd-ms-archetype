package it.gov.pagopa.bpd.${msPackageName}.model.resource;

import it.gov.pagopa.bpd.${msPackageName}.model.enums.DummyEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.core.Relation;
import eu.sia.meda.core.resource.BaseResource;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

//FIXME: remove me (created as archetype test)
@Data @NoArgsConstructor @AllArgsConstructor
@Relation(value = "dummyResource", collectionRelation = "dummyResources")
public class DummyResource extends BaseResource {
    private String message;
    @Enumerated(EnumType.STRING)
    private DummyEnum type;
}
