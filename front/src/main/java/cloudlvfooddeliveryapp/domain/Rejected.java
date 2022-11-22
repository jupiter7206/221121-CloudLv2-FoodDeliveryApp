package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;
    private String foodId;
    private String preferenceId;
    private String orderId;
    private String status;
    private String menuId;
    private String foodName;
}


