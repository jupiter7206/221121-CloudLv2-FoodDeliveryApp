package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.OrderPlaced;
import cloudlvfooddeliveryapp.domain.NotifyOrderStatusViaKakaotalk;
import cloudlvfooddeliveryapp.domain.MenusSelected;
import cloudlvfooddeliveryapp.domain.OrderStatusInquried;
import cloudlvfooddeliveryapp.domain.OrderChanged;
import cloudlvfooddeliveryapp.domain.NotifiedByApp;
import cloudlvfooddeliveryapp.domain.OrderCanceled;
import cloudlvfooddeliveryapp.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Order_table")
@Data

public class Order  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String customerName;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String foodName;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        cloudlvfooddeliveryapp.external.Payment payment = new cloudlvfooddeliveryapp.external.Payment();
        // mappings goes here
        FrontApplication.applicationContext.getBean(cloudlvfooddeliveryapp.external.PaymentService.class)
            .pay(payment);


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();



        NotifyOrderStatusViaKakaotalk notifyOrderStatusViaKakaotalk = new NotifyOrderStatusViaKakaotalk(this);
        notifyOrderStatusViaKakaotalk.publishAfterCommit();



        MenusSelected menusSelected = new MenusSelected(this);
        menusSelected.publishAfterCommit();



        OrderStatusInquried orderStatusInquried = new OrderStatusInquried(this);
        orderStatusInquried.publishAfterCommit();



        OrderChanged orderChanged = new OrderChanged(this);
        orderChanged.publishAfterCommit();



        NotifiedByApp notifiedByApp = new NotifiedByApp(this);
        notifiedByApp.publishAfterCommit();

        // Get request from Payment
        //cloudlvfooddeliveryapp.external.Payment payment =
        //    Application.applicationContext.getBean(cloudlvfooddeliveryapp.external.PaymentService.class)
        //    .getPayment(/** mapping value needed */);

    }
    @PreRemove
    public void onPreRemove(){


        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = FrontApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }




    public static void updateStatus(Accepted accepted){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(accepted.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }
    public static void updateStatus(Rejected rejected){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(rejected.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }
    public static void updateStatus(Cooking cooking){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(cooking.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }
    public static void updateStatus(Cooked cooked){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(cooked.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }
    public static void updateStatus(Deliverycompleted deliverycompleted){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliverycompleted.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }
    public static void notificateByApp(Picked picked){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(picked.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }


}
