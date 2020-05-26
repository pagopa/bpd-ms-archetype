package ${package}.${msPackageName}.dao.model;

import it.gov.pagopa.bpd.common.model.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"}, callSuper = false)
@Table(name = "dummy_entity")
public class DummyEntity extends BaseEntity {//FIXME: remove me (created as archetype test)


}
