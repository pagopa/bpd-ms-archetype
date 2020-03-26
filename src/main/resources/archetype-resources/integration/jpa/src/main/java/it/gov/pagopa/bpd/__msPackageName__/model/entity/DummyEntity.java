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
@Table(name = "\"DUMMY_ENTITY\"", schema = "\"BPD_TEST\"")
public class DummyEntity implements Serializable {//FIXME: remove me (created as archetype test)


}
