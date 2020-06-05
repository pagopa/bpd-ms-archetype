package ${package}.${msPackageName}.connector.web.dummy.model;

import ${package}.${msPackageName}.connector.web.dummy.model.enums.DummyEnum;

import lombok.Data;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

@Data
//FIXME: remove me (created as archetype test)
public class DummyModel implements Serializable {
    private String id;
    private DummyEnum type;
    @NotNull
    private String message;
}