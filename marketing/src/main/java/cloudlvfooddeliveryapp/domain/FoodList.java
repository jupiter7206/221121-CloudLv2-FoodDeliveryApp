package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.MarketingApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="FoodList_table")
@Data

public class FoodList  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String foodName;
    
    
    
    
    
    private String stock;
    
    
    
    
    
    private String status;


    public static FoodListRepository repository(){
        FoodListRepository foodListRepository = MarketingApplication.applicationContext.getBean(FoodListRepository.class);
        return foodListRepository;
    }




    public static void collectOrderList(MenusSelected menusSelected){

        /** Example 1:  new item 
        FoodList foodList = new FoodList();
        repository().save(foodList);

        Rejected rejected = new Rejected(foodList);
        rejected.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(menusSelected.get???()).ifPresent(foodList->{
            
            foodList // do something
            repository().save(foodList);

            Rejected rejected = new Rejected(foodList);
            rejected.publishAfterCommit();

         });
        */

        
    }
    public static void suggestionPref(EveryNoonEvent everyNoonEvent){

        /** Example 1:  new item 
        FoodList foodList = new FoodList();
        repository().save(foodList);

        */

        /** Example 2:  finding and process
        
        repository().findById(everyNoonEvent.get???()).ifPresent(foodList->{
            
            foodList // do something
            repository().save(foodList);


         });
        */

        
    }


}
