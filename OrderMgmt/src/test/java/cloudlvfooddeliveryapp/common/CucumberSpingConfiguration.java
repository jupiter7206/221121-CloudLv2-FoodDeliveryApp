package cloudlvfooddeliveryapp.common;


import cloudlvfooddeliveryapp.OrderMgmtApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderMgmtApplication.class })
public class CucumberSpingConfiguration {
    
}
