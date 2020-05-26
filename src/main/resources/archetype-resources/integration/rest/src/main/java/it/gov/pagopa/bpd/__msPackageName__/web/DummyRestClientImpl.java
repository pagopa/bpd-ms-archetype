#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${msPackageName}.web;

import ${package}.${msPackageName}.web.model.DummyModel;
import eu.sia.meda.connector.rest.transformer.request.SimpleRestGetRequestTransformer;
import eu.sia.meda.connector.rest.transformer.response.SimpleRest2xxResponseTransformer;
import eu.sia.meda.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
class DummyRestClientImpl extends BaseService {//FIXME: remove me (created as archetype test)

    private final DummyRestConnector connector;
    private final SimpleRestGetRequestTransformer requestTransformer;
    private final SimpleRest2xxResponseTransformer<DummyModel> responseTransformer;

    @Autowired
    public DummyRestClientImpl(DummyRestConnector connector,
                                SimpleRestGetRequestTransformer requestTransformer,
                                SimpleRest2xxResponseTransformer<DummyModel> responseTransformer) {
        this.connector = connector;
        this.requestTransformer = requestTransformer;
        this.responseTransformer = responseTransformer;
    }

    public DummyModel dummyRestServiceMethod() {
        final HashMap<String, Object> params = new HashMap<>();
        params.put("pathVariableName", "pathVariablevalue");
        final HashMap<String, Object> queryParams = new HashMap<>();
        params.put("queryParamName", "queryParamValue");

        return connector.call(null, requestTransformer, responseTransformer, params, queryParams);
    }
}
