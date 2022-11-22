package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class NotifyOrderStatusViaKakaotalk extends AbstractEvent {

    private Long id;

    public NotifyOrderStatusViaKakaotalk(Order aggregate){
        super(aggregate);
    }
    public NotifyOrderStatusViaKakaotalk(){
        super();
    }
}
