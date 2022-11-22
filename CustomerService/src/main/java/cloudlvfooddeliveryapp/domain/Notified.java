package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Notified extends AbstractEvent {

    private Long id;

    public Notified(Notice aggregate){
        super(aggregate);
    }
    public Notified(){
        super();
    }
}
