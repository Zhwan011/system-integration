package zhwan.systeam.demo.models;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Import From JPA
@Repository

// Handle Data For PantEntry  assosiate with entity work with id attr
public interface PlantInventoryEntryRepository extends JpaRepository<PlantInventoryEntry, Long> {

}
