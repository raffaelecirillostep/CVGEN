package it.step.service;

import it.step.model.Cv;

import java.util.List;
import java.util.Optional;

public interface CvService {
    Optional<Cv> getCvByID(String id);
    List<Cv> getAllCv();
    Cv saveCv(Cv cv);
    Cv deleteCv(Cv cv);
}
