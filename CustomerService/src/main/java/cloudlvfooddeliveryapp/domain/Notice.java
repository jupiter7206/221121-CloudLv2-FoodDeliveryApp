package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.Notified;
import cloudlvfooddeliveryapp.CustomerServiceApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Notice_table")
@Data

public class Notice  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String cutomerName;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String message;

    @PostPersist
    public void onPostPersist(){


        Notified notified = new Notified(this);
        notified.publishAfterCommit();

    }

    public static NoticeRepository repository(){
        NoticeRepository noticeRepository = CustomerServiceApplication.applicationContext.getBean(NoticeRepository.class);
        return noticeRepository;
    }




    public static void notificationService(Deliverycompleted deliverycompleted){

        /** Example 1:  new item 
        Notice notice = new Notice();
        repository().save(notice);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliverycompleted.get???()).ifPresent(notice->{
            
            notice // do something
            repository().save(notice);


         });
        */

        
    }
    public static void notificationService(NotifyOrderStatusViaKakaotalk notifyOrderStatusViaKakaotalk){

        /** Example 1:  new item 
        Notice notice = new Notice();
        repository().save(notice);

        */

        /** Example 2:  finding and process
        
        repository().findById(notifyOrderStatusViaKakaotalk.get???()).ifPresent(notice->{
            
            notice // do something
            repository().save(notice);


         });
        */

        
    }
    public static void notificationService(FoodAdd foodAdd){

        /** Example 1:  new item 
        Notice notice = new Notice();
        repository().save(notice);

        */

        /** Example 2:  finding and process
        
        repository().findById(foodAdd.get???()).ifPresent(notice->{
            
            notice // do something
            repository().save(notice);


         });
        */

        
    }


}
