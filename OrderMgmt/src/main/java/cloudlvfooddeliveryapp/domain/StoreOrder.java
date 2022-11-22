package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.OrderMgmtApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="StoreOrder_table")
@Data

public class StoreOrder  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String preferenceId;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private String foodName;

    @PostPersist
    public void onPostPersist(){
    }

    public static StoreOrderRepository repository(){
        StoreOrderRepository storeOrderRepository = OrderMgmtApplication.applicationContext.getBean(StoreOrderRepository.class);
        return storeOrderRepository;
    }




    public static void orderCancellationNotice(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        StoreOrder storeOrder = new StoreOrder();
        repository().save(storeOrder);

        Rejected rejected = new Rejected(storeOrder);
        rejected.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(storeOrder->{
            
            storeOrder // do something
            repository().save(storeOrder);

            Rejected rejected = new Rejected(storeOrder);
            rejected.publishAfterCommit();

         });
        */

        
    }
    public static void deliveryOfOrderInformation(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        StoreOrder storeOrder = new StoreOrder();
        repository().save(storeOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(storeOrder->{
            
            storeOrder // do something
            repository().save(storeOrder);


         });
        */

        
    }


}
