#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package it.gov.pagopa.bpd.${msPackageName};

import eu.sia.meda.event.BaseEventConnector;
import it.gov.pagopa.bpd.${msPackageName}.model.DummyModel;
import org.springframework.stereotype.Service;

@Service
public class DummyPublisherConnector extends BaseEventConnector<DummyModel, Boolean, DummyModel, Void> {//FIXME: remove me (created as archetype test)
}
