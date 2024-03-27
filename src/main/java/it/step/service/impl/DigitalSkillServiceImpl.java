package it.step.service.impl;

import it.step.model.DigitalSkill;
import it.step.repository.DigitalSkillRepo;
import it.step.service.DigitalSkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class DigitalSkillServiceImpl implements DigitalSkillService {
    
    private final DigitalSkillRepo repo;
    
    @Override
    public Optional<DigitalSkill> getDigitalSkillByID(String id) {
        return repo.findById(id);
    }

    @Override
    public List<DigitalSkill> getAllDigitalSkills() {
        return repo.findAll();
    }

    @Override
    public DigitalSkill saveDigitalSkill(DigitalSkill digitalSkill) {
        return repo.save(digitalSkill);
    }

    @Override
    public DigitalSkill deleteDigitalSkill(DigitalSkill digitalSkill) {
        digitalSkill.setIsDeleted(!digitalSkill.getIsDeleted());
        if(digitalSkill.getIsDeleted()){
            digitalSkill.setDeletedAt(new Date());
        } else {
            digitalSkill.setDeletedAt(null);
        }
        repo.save(digitalSkill);
        return digitalSkill;
    }
}
