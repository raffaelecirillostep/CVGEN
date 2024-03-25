package it.step.service.impl;

import it.step.model.Province;
import it.step.repository.ProvinceRepo;
import it.step.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepo repo;

    @Override
    public List<Province> getAllProvince() {
        return repo.findAll();
    }

    @Override
    public Optional<Province> getProvinceById(String id) {
        return repo.findById(id);
    }

    @Override
    public Province saveProvince(Province province) {
        return repo.save(province);
    }

    @Override
    public Province deleteProvince(Province province) {
        //repo.delete(province);
        province.setIsDeleted(true);
        province.setDeletedAt(new Date());
        return province;
    }
}
