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
import java.util.Optional;

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
    public Optional<Language> getOneById(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Language> getAll() {
        return repo.findAll();
    }

    @Override
    public Language update(Language language) {
        if(repo.existsById(language.getId()))
            return repo.save(language);
        else
            return null;
    }

    @Override
    public Language deleteById(String id) {
        Language language = repo.findById(id).orElse(null);
        if(language != null && !language.getIsDeleted()){
            language.setIsDeleted(true);
            language.setDeletedAt(new Date());
            language = repo.save(language);
        }

        return language;
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
