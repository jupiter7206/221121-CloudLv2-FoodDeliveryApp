package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class NotifiedByApp extends AbstractEvent {

    private Long id;

    public NotifiedByApp(Order aggregate){
        super(aggregate);
    }
    public NotifiedByApp(){
        super();
    }
}
