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
    @Autowired PaymentRepository paymentRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_PaymentCancellation(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener PaymentCancellation : " + orderCanceled + "\n\n");


        

        // Sample Logic //
        Payment.paymentCancellation(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_PaymentCancellation(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener PaymentCancellation : " + rejected + "\n\n");


        

        // Sample Logic //
        Payment.paymentCancellation(event);
        

        

    }

}


