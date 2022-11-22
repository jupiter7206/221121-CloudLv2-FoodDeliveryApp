package cloudlvfooddeliveryapp.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import cloudlvfooddeliveryapp.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import cloudlvfooddeliveryapp.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired NoticeRepository noticeRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Deliverycompleted'")
    public void wheneverDeliverycompleted_NotificationService(@Payload Deliverycompleted deliverycompleted){

        Deliverycompleted event = deliverycompleted;
        System.out.println("\n\n##### listener NotificationService : " + deliverycompleted + "\n\n");


        

        // Sample Logic //
        Notice.notificationService(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='NotifyOrderStatusViaKakaotalk'")
    public void wheneverNotifyOrderStatusViaKakaotalk_NotificationService(@Payload NotifyOrderStatusViaKakaotalk notifyOrderStatusViaKakaotalk){

        NotifyOrderStatusViaKakaotalk event = notifyOrderStatusViaKakaotalk;
        System.out.println("\n\n##### listener NotificationService : " + notifyOrderStatusViaKakaotalk + "\n\n");


        

        // Sample Logic //
        Notice.notificationService(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='FoodAdd'")
    public void wheneverFoodAdd_NotificationService(@Payload FoodAdd foodAdd){

        FoodAdd event = foodAdd;
        System.out.println("\n\n##### listener NotificationService : " + foodAdd + "\n\n");


        

        // Sample Logic //
        Notice.notificationService(event);
        

        

    }

}


