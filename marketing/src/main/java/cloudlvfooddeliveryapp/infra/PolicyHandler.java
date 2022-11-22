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
    @Autowired FoodListRepository foodListRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='MenusSelected'")
    public void wheneverMenusSelected_CollectOrderList(@Payload MenusSelected menusSelected){

        MenusSelected event = menusSelected;
        System.out.println("\n\n##### listener CollectOrderList : " + menusSelected + "\n\n");


        

        // Sample Logic //
        FoodList.collectOrderList(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='EveryNoonEvent'")
    public void wheneverEveryNoonEvent_SuggestionPref(@Payload EveryNoonEvent everyNoonEvent){

        EveryNoonEvent event = everyNoonEvent;
        System.out.println("\n\n##### listener SuggestionPref : " + everyNoonEvent + "\n\n");


        

        // Sample Logic //
        FoodList.suggestionPref(event);
        

        

    }

}


