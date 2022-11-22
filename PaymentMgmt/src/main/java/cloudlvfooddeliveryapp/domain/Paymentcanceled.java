package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paymentcanceled extends AbstractEvent {

    private Long id;

    public Paymentcanceled(Payment aggregate){
        super(aggregate);
    }
    public Paymentcanceled(){
        super();
    }
}
