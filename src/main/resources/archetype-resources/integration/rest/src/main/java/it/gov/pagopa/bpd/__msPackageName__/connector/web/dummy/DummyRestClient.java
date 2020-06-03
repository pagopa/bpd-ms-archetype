#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${msPackageName}.connector.web.dummy;

import ${package}.${msPackageName}.connector.web.dummy.model.DummyModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Dummy Rest Client
 */
@FeignClient(name = "${rest-client.dummy.serviceCode}", url = "${rest-client.dummy.base-url}")
public interface DummyRestClient {//FIXME: remove me (created as archetype test)

    @GetMapping(value = "${rest-client.dummy.dummy-method.url}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    DummyModel dummyRestServiceMethod(@PathVariable("id") String id);

}
