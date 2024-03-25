package it.step.service;

import it.step.model.Qualification;

import java.util.List;
import java.util.Optional;

public interface QualificationService {
    Optional<Qualification> getQualificationByID(String id);
    List<Qualification> getAllQualifications();
    Qualification saveQualification(Qualification qualification);
    Qualification deleteQualification(Qualification qualification);
}
