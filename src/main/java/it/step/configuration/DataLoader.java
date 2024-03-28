package it.step.configuration;

import it.step.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private TownService townService;

    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private LanguageService languageService;

    @Autowired
    private TechnologyService technologyService;

    @Autowired
    private DigitalSkillService digitalSkillService;

    @Override
    public void run(String... args) throws Exception {
        townService.insertCitiesFromJson("comuni.json");
        provinceService.insertProvincesFromJson("province.json");
        languageService.insertLanguageFromJson("languages.json");
        technologyService.insertTechnologiesFromJson("technologies.json");
        digitalSkillService.insertDigitalSkillFromJson("digitalskills.json");
    }
}
