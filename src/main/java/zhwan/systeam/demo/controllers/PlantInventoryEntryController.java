package zhwan.systeam.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zhwan.systeam.demo.models.PlantInventoryEntry;
import zhwan.systeam.demo.models.PlantInventoryEntryRepository;

import java.util.List;

/**
 * Created by lgarcia on 2/10/2017.
 */

@RestController
public class PlantInventoryEntryController {
    @Autowired
    PlantInventoryEntryRepository repo;

    @GetMapping("/plants")
    public List<PlantInventoryEntry> findAll() {
        return repo.findAll();
    }
}