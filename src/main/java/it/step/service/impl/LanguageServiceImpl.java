package it.step.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.step.model.Language;
import it.step.repository.LanguageRepo;
import it.step.service.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class LanguageServiceImpl implements LanguageService {

    private final LanguageRepo repo;

    @Override
    public Language save(Language language) {
        return repo.save(language);
    }

    @Override
    public Language getOneById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Language> getAll() {
        return repo.findAll();
    }

    @Override
    public Language update(Language language) {
        return repo.save(language);
    }

    @Override
    public Language deleteById(String id) {
        Language lang = repo.findById(id).orElse(null);
        if(lang != null){
            lang.setIsDeleted(true);
            lang.setDeletedAt(new Date());
        }

        return lang != null ? repo.save(lang) : null;
    }

    @Override
    public void insertLanguageFromJson(String jsonPath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        if(repo.count() == 0){
            List<Language> lst = Arrays.asList( mapper.readValue(new ClassPathResource(jsonPath).getInputStream(), Language[].class));
            repo.saveAll(lst);
        }

    }
}
