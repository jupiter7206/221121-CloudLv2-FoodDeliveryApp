package cloudlvfooddeliveryapp.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="Menuboard_table")
@Data
public class Menuboard {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}