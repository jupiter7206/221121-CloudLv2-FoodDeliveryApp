package cloudlvfooddeliveryapp.infra;
import cloudlvfooddeliveryapp.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class FoodListHateoasProcessor implements RepresentationModelProcessor<EntityModel<FoodList>>  {

    @Override
    public EntityModel<FoodList> process(EntityModel<FoodList> model) {

        
        return model;
    }
    
}
