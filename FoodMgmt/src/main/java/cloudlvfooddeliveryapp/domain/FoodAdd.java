package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodAdd extends AbstractEvent {

    private Long id;

    public FoodAdd(FoodList aggregate){
        super(aggregate);
    }
    public FoodAdd(){
        super();
    }
}
