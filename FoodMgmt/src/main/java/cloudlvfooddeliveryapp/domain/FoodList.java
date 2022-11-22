package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.FoodAdd;
import cloudlvfooddeliveryapp.domain.FoodModify;
import cloudlvfooddeliveryapp.domain.FoodDelete;
import cloudlvfooddeliveryapp.domain.FoodStop;
import cloudlvfooddeliveryapp.FoodMgmtApplication;
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
    
    
    
    
    
    private String foodPrice;
    
    
    
    
    
    private String foodNetPrice;
    
    
    
    
    
    private String foodCostPrice;
    
    
    
    
    
    private String stock;
    
    
    
    
    
    private String useYn;
    
    
    
    
    
    private String option;

    @PostPersist
    public void onPostPersist(){


        FoodAdd foodAdd = new FoodAdd(this);
        foodAdd.publishAfterCommit();



        FoodModify foodModify = new FoodModify(this);
        foodModify.publishAfterCommit();



        FoodDelete foodDelete = new FoodDelete(this);
        foodDelete.publishAfterCommit();



        FoodStop foodStop = new FoodStop(this);
        foodStop.publishAfterCommit();

    }

    public static FoodListRepository repository(){
        FoodListRepository foodListRepository = FoodMgmtApplication.applicationContext.getBean(FoodListRepository.class);
        return foodListRepository;
    }






}
