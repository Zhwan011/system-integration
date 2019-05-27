package zhwan.systeam.demo.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class PlantInventoryEntry {
    //  Come From JPA
    @Id
    @GeneratedValue
    // Datta We Store in the DB
    Long id;
    String name;
    String description;
    BigDecimal price;
}
