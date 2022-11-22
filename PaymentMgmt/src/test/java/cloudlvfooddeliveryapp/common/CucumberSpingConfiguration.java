package cloudlvfooddeliveryapp.common;


import cloudlvfooddeliveryapp.PaymentMgmtApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PaymentMgmtApplication.class })
public class CucumberSpingConfiguration {
    
}
