package it.gov.pagopa.bpd.${msPackageName}.model;

import it.gov.pagopa.bpd.${msPackageName}.model.enums.DummyEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import javax.validation.constraints.NotNull;

@Data @NoArgsConstructor @AllArgsConstructor
//FIXME: remove me (created as archetype test)
public class DummyModel implements Serializable {
    private String id;
    @Enumerated(EnumType.STRING)
    private DummyEnum type;
    @NotNull
    private String message;
}