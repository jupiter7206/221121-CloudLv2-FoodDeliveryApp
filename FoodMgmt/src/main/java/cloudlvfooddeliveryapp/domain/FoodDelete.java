package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodDelete extends AbstractEvent {

    private Long id;

    public FoodDelete(FoodList aggregate){
        super(aggregate);
    }
    public FoodDelete(){
        super();
    }
}
