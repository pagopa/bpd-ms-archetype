#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${msPackageName}.web.assembler;

import ${package}.${msPackageName}.web.model.DummyResource;
import ${package}.${msPackageName}.messaging.model.DummyModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
//FIXME: remove me (created as archetype test)
public class DummyResourceAssembler {

    public DummyResource toResource(DummyModel model) {
        DummyResource resource = null;

        if (model != null) {
            resource = new DummyResource();
            BeanUtils.copyProperties(model, resource);
        }

        return resource;
    }

}
