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
    @Autowired OrderRepository orderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Accepted'")
    public void wheneverAccepted_UpdateStatus(@Payload Accepted accepted){

        Accepted event = accepted;
        System.out.println("\n\n##### listener UpdateStatus : " + accepted + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_UpdateStatus(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener UpdateStatus : " + rejected + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Cooking'")
    public void wheneverCooking_UpdateStatus(@Payload Cooking cooking){

        Cooking event = cooking;
        System.out.println("\n\n##### listener UpdateStatus : " + cooking + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Cooked'")
    public void wheneverCooked_UpdateStatus(@Payload Cooked cooked){

        Cooked event = cooked;
        System.out.println("\n\n##### listener UpdateStatus : " + cooked + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Deliverycompleted'")
    public void wheneverDeliverycompleted_UpdateStatus(@Payload Deliverycompleted deliverycompleted){

        Deliverycompleted event = deliverycompleted;
        System.out.println("\n\n##### listener UpdateStatus : " + deliverycompleted + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Picked'")
    public void wheneverPicked_NotificateByApp(@Payload Picked picked){

        Picked event = picked;
        System.out.println("\n\n##### listener NotificateByApp : " + picked + "\n\n");


        

        // Sample Logic //
        Order.notificateByApp(event);
        

        

    }

}


