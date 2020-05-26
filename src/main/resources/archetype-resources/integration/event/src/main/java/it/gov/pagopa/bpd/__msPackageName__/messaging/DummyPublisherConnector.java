#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${msPackageName}.messaging;

import eu.sia.meda.event.BaseEventConnector;
import ${package}.${msPackageName}.messaging.model.DummyModel;
import org.springframework.stereotype.Service;

@Service
public class DummyPublisherConnector extends BaseEventConnector<DummyModel, Boolean, DummyModel, Void> {//FIXME: remove me (created as archetype test)
}
