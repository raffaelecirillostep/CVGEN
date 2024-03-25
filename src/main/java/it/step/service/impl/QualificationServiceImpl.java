package it.step.service.impl;

import it.step.model.Qualification;
import it.step.repository.QualificationRepo;
import it.step.service.QualificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class QualificationServiceImpl implements QualificationService {

    private final QualificationRepo repo;

    @Override
    public Optional<Qualification> getQualificationByID(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Qualification> getAllQualifications() {
        return repo.findAll();
    }

    @Override
    public Qualification saveQualification(Qualification qualification) {
        return repo.save(qualification);
    }

    @Override
    public Qualification deleteQualification(Qualification qualification) {
        repo.delete(qualification);
        qualification.setDeleted(true);
        return qualification;
    }
}
