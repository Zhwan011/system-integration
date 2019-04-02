package zhwan.systeam.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import zhwan.systeam.demo.models.PlantInventoryEntry;
import zhwan.systeam.demo.models.PlantInventoryEntryRepository;

import java.math.BigDecimal;

@SpringBootApplication
public class Zhwan011Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Zhwan011Application.class, args);
        PlantInventoryEntryRepository repository = ctx.getBean(PlantInventoryEntryRepository.class);

        PlantInventoryEntry plant = new PlantInventoryEntry();
        plant.setName("Bike");
        plant.setDescription("Nice and shiny");
        plant.setPrice(BigDecimal.valueOf(100));

        repository.save(plant);

        System.out.println(repository.findAll());

    }
}
