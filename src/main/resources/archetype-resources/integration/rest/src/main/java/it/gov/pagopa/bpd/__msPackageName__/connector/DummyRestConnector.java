#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${msPackageName}.connector;

import ${package}.${msPackageName}.connector.model.DummyModel;
import eu.sia.meda.connector.meda.MedaInternalConnector;
import org.springframework.stereotype.Service;


@Service
class DummyRestConnector//FIXME: remove me (created as archetype test)
        extends MedaInternalConnector<Void, DummyModel, Void, DummyModel> {//TODO: use BaseRestConnector instead of MedaInternalConnector for external REST connector

}
