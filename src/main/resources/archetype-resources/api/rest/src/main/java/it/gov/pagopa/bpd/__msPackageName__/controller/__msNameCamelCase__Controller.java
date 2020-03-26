#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package it.gov.pagopa.bpd.${msPackageName}.controller;

import it.gov.pagopa.bpd.${msPackageName}.model.resource.DummyResource;
import it.gov.pagopa.bpd.${msPackageName}.model.dto.DummyDTO;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Controller to expose MicroService
 */
@Api(tags = "${msName} Controller")
@RequestMapping("/${msName}")
public interface ${msNameCamelCase}Controller {
    @PostMapping(value = "/test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    DummyResource test(@Valid @RequestBody DummyDTO request); //FIXME: remove me (created as archetype test)
}
