#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${msPackageName}.controller;

import eu.sia.meda.core.controller.StatelessController;
import ${package}.${msPackageName}.model.resource.DummyResource;
import ${package}.${msPackageName}.model.dto.DummyDTO;
import ${package}.${msPackageName}.assembler.DummyResourceAssembler;
import ${package}.${msPackageName}.command.DummyCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@Slf4j
class ${msNameCamelCase}ControllerImpl extends StatelessController implements ${msNameCamelCase}Controller {

    private final BeanFactory beanFactory;
    private final DummyResourceAssembler dummyResourceAssembler;

    @Autowired
    public ${msNameCamelCase}ControllerImpl(BeanFactory beanFactory, DummyResourceAssembler dummyResourceAssembler){
        this.beanFactory = beanFactory;
        this.dummyResourceAssembler = dummyResourceAssembler;
    }

    @Override
    public DummyResource test(DummyDTO request) { //FIXME: remove me (created as archetype test)
        log.info(request.toString());

        DummyResource result = null;
        try {
            result = dummyResourceAssembler.toResource(beanFactory.getBean(DummyCommand.class, request.getMessage()).execute());
        } catch (Exception e) {
            log.error("Something gone wrong", e);
        }

        return result;
    }

}
