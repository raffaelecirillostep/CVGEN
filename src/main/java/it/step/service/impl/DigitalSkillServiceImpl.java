package it.step.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.step.model.DigitalSkill;
import it.step.model.Province;
import it.step.model.Technology;
import it.step.repository.DigitalSkillRepo;
import it.step.service.DigitalSkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class DigitalSkillServiceImpl implements DigitalSkillService {
    
    private final DigitalSkillRepo repo;

    @Autowired
    private MongoTemplate mongoTemplate;
    
    @Override
    public Optional<DigitalSkill> getDigitalSkillByID(String id) {
        return repo.findById(id);
    }

    @Override
    public List<DigitalSkill> getAllDigitalSkills() {

        return repo.findAllByIsDeletedFalse();
    }

    @Override
    public DigitalSkill saveDigitalSkill(DigitalSkill digitalSkill) {
        return repo.save(digitalSkill);
    }

    @Override
    public DigitalSkill deleteDigitalSkill(DigitalSkill digitalSkill) {
        digitalSkill.setIsDeleted(true);

        if (digitalSkill.getDeletedAt() == null) {
            digitalSkill.setDeletedAt(new Date());
        }

        repo.save(digitalSkill);
        return digitalSkill;
    }


    @Override
    public void insertDigitalSkillFromJson(String jsonPath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        if(repo.count() == 0)
        {
            List<DigitalSkill> lst = Arrays.asList(mapper.readValue(new ClassPathResource(jsonPath).getInputStream(),DigitalSkill[].class));
            repo.saveAll(lst);
        }

    }
}
