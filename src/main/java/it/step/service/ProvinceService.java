package it.step.service;

import it.step.model.Province;

import java.util.List;
import java.util.Optional;

public interface ProvinceService {

    public List<Province> getAllProvince();

    public Optional<Province> getProvinceById(String id);

    public Province saveProvince(Province province);

    public Province deleteProvince(Province province);
}
