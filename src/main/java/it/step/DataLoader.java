package it.step;

import it.step.service.TownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private TownService townService;

    @Override
    public void run(String... args) throws Exception {
        townService.insertCitiesFromJson("comuni.json");
    }
}
