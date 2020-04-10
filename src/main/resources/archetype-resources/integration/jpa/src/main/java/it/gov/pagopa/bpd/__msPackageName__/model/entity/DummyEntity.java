package ${package}.${msPackageName}.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"}, callSuper = false)
@Table(name = "dummy_entity")
public class DummyEntity implements Serializable {//FIXME: remove me (created as archetype test)


}
