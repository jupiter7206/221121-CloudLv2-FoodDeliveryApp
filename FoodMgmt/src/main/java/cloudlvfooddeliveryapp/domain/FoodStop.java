package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodStop extends AbstractEvent {

    private Long id;

    public FoodStop(FoodList aggregate){
        super(aggregate);
    }
    public FoodStop(){
        super();
    }
}
