package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodModify extends AbstractEvent {

    private Long id;

    public FoodModify(FoodList aggregate){
        super(aggregate);
    }
    public FoodModify(){
        super();
    }
}
