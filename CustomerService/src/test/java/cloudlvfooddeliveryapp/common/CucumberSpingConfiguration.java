package cloudlvfooddeliveryapp.common;


import cloudlvfooddeliveryapp.CustomerServiceApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerServiceApplication.class })
public class CucumberSpingConfiguration {
    
}
