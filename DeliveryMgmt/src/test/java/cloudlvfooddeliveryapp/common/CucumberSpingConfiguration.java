package cloudlvfooddeliveryapp.common;


import cloudlvfooddeliveryapp.DeliveryMgmtApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryMgmtApplication.class })
public class CucumberSpingConfiguration {
    
}
