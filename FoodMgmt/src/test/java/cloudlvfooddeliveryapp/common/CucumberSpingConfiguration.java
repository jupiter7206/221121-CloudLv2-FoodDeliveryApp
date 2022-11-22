package cloudlvfooddeliveryapp.common;


import cloudlvfooddeliveryapp.FoodMgmtApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { FoodMgmtApplication.class })
public class CucumberSpingConfiguration {
    
}
