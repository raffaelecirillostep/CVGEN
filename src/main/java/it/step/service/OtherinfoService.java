package it.step.service;

import it.step.model.Otherinfo;

import java.util.List;
import java.util.Optional;

public interface OtherinfoService {

    public List<Otherinfo> getAllByEmployee();

    public Optional<Otherinfo> getOtherinfoById(String id);

    public Otherinfo saveOtherinfo(Otherinfo otherinfo);

    public Otherinfo deleteOtherinfo(Otherinfo otherinfo);
}
