package ${package}.${msPackageName}.model;

import ${package}.${msPackageName}.model.enums.DummyEnum;

import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import javax.validation.constraints.NotNull;

@Data
//FIXME: remove me (created as archetype test)
public class DummyModel implements Serializable {
    private String id;
    @Enumerated(EnumType.STRING)
    private DummyEnum type;
    @NotNull
    private String message;
}