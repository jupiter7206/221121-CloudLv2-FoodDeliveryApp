package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class NotifyOrderStatusViaKakaotalk extends AbstractEvent {

    private Long id;
}


