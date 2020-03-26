#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package it.gov.pagopa.bpd.${msPackageName}.assembler;

import it.gov.pagopa.bpd.${msPackageName}.model.resource.DummyResource;
import it.gov.pagopa.bpd.${msPackageName}.model.DummyModel;
import eu.sia.meda.core.assembler.BaseResourceAssemblerSupport;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
//FIXME: remove me (created as archetype test)
public class DummyResourceAssembler extends BaseResourceAssemblerSupport<DummyModel, DummyResource> {

    public DummyResourceAssembler() {
        super(DummyModel.class, DummyResource.class);
    }

    @Override
    public DummyResource toResource(DummyModel test) {
        if (test == null) {
            return null;
        }
        DummyResource resource = createResourceWithId(test.getId(), test);
        if (test.getId() != null) {
            resource.setEntityId(test.getId());
        }
        BeanUtils.copyProperties(test, resource);
        return resource;
    }
}
