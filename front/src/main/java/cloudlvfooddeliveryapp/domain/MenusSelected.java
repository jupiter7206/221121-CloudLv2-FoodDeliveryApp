package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MenusSelected extends AbstractEvent {

    private Long id;

    public MenusSelected(Order aggregate){
        super(aggregate);
    }
    public MenusSelected(){
        super();
    }
}
