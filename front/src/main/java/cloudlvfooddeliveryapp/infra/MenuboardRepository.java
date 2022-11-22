package cloudlvfooddeliveryapp.infra;

import cloudlvfooddeliveryapp.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="menuboards", path="menuboards")
public interface MenuboardRepository extends PagingAndSortingRepository<Menuboard, Long> {

    

    
}
