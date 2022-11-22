package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Cooking extends AbstractEvent {

    private Long id;

    public Cooking(Preference aggregate){
        super(aggregate);
    }
    public Cooking(){
        super();
    }
}
