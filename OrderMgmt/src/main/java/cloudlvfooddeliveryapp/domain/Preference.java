package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.Accepted;
import cloudlvfooddeliveryapp.domain.Rejected;
import cloudlvfooddeliveryapp.domain.Cooked;
import cloudlvfooddeliveryapp.domain.Cooking;
import cloudlvfooddeliveryapp.OrderMgmtApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Preference_table")
@Data

public class Preference  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String customerName;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String foodName;
    
    
    
    
    
    private String count;

    @PostPersist
    public void onPostPersist(){


        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();



        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();



        Cooked cooked = new Cooked(this);
        cooked.publishAfterCommit();



        Cooking cooking = new Cooking(this);
        cooking.publishAfterCommit();

    }

    public static PreferenceRepository repository(){
        PreferenceRepository preferenceRepository = OrderMgmtApplication.applicationContext.getBean(PreferenceRepository.class);
        return preferenceRepository;
    }






}
