package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Deliverycompleted extends AbstractEvent {

    private Long id;

    public Deliverycompleted(Delivery aggregate){
        super(aggregate);
    }
    public Deliverycompleted(){
        super();
    }
}
