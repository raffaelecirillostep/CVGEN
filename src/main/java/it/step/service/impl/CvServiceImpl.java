package it.step.service.impl;

import it.step.model.Cv;
import it.step.repository.CvRepo;
import it.step.service.CvService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CvServiceImpl implements CvService {

    private final CvRepo repo;

    @Override
    public Optional<Cv> getCvByID(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Cv> getAllCv() {
        return repo.findAll();
    }

    @Override
    public Cv saveCv(Cv cv) {
        return repo.save(cv);
    }

    @Override
    public Cv deleteCv(Cv cv) {
        cv.setIsDeleted(!cv.getIsDeleted());
        if(cv.getIsDeleted()){
            cv.setDeletedAt(new Date());
        } else {
            cv.setDeletedAt(null);
        }
        repo.save(cv);
        return cv;
    }
}
