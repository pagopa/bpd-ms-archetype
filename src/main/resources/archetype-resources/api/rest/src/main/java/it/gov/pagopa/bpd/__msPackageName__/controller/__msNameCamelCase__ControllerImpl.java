#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package it.gov.pagopa.bpd.${msPackageName}.controller;

import it.gov.pagopa.bpd.${msPackageName}.model.resource.DummyResource;
import it.gov.pagopa.bpd.${msPackageName}.model.dto.DummyDTO;
import it.gov.pagopa.bpd.${msPackageName}.assembler.DummyResourceAssembler;
import it.gov.pagopa.bpd.${msPackageName}.command.DummyCommand;
import eu.sia.meda.core.controller.StatelessController;
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
        return dummyResourceAssembler.toResource(beanFactory.getBean(DummyCommand.class, request.getMessage()).execute());
    }
}
