package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderStatusInquried extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String customerName;
    private String foodId;
    private String foodName;
    private Integer qty;
    private String address;

    public OrderStatusInquried(Order aggregate){
        super(aggregate);
    }
    public OrderStatusInquried(){
        super();
    }
}
