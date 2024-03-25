package it.step.service.impl;


import it.step.model.Otherinfo;

import it.step.repository.OtherinfoRepo;

import it.step.service.OtherinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class OtherinfoServiceImpl implements OtherinfoService {

    @Autowired
    private OtherinfoRepo otherinfoRepo;

    @Override
    public List<Otherinfo> getAllByEmployee() {
        return otherinfoRepo.findAll();
    }

    @Override
    public Optional<Otherinfo> getOtherinfoById(String id) {
        return otherinfoRepo.findById(id);
    }

    @Override
    public Otherinfo saveOtherinfo(Otherinfo otherinfo) {
        return otherinfoRepo.save(otherinfo);
    }

    @Override
    public Otherinfo deleteOtherinfo(Otherinfo otherinfo) {
        otherinfo.setIsDeleted(true);
        otherinfo.setDeletedAt(new Date());
        return otherinfo;
    }
}
