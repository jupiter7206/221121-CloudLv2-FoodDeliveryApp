package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderChanged extends AbstractEvent {

    private Long id;

    public OrderChanged(Order aggregate){
        super(aggregate);
    }
    public OrderChanged(){
        super();
    }
}
