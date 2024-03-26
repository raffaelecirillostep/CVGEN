package it.step.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.step.model.Province;
import it.step.repository.ProvinceRepo;
import it.step.service.ProvinceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepo repo;
    @Autowired
    private MongoTemplate mongoTemplate;
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
//        province.setIsDeleted(true);
//        province.setDeletedAt(new Date());
        return province;
    }



    public void insertProvincesFromJson(String jsonFilePath) throws IOException {
        // Leggi il file JSON
        ObjectMapper objectMapper = new ObjectMapper();
        ClassPathResource resource = new ClassPathResource(jsonFilePath);
        List<Province> provinces = Arrays.asList(objectMapper.readValue(resource.getInputStream(), Province[].class));

        // Inserisci i dati su MongoDB
        mongoTemplate.insert(provinces, Province.class);
    }
}
