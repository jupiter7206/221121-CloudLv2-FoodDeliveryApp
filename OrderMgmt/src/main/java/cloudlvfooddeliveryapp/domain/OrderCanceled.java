package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String customerName;
    private String foodId;
    private String foodName;
    private Integer qty;
    private String address;
}


