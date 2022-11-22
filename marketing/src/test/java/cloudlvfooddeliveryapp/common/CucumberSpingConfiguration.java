package cloudlvfooddeliveryapp.common;


import cloudlvfooddeliveryapp.MarketingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MarketingApplication.class })
public class CucumberSpingConfiguration {
    
}
