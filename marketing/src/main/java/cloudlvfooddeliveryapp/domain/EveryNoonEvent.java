package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class EveryNoonEvent extends AbstractEvent {

    private Long id;

    public EveryNoonEvent(){
        super();
    }
}
