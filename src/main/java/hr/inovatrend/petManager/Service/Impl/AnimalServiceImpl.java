package hr.inovatrend.petManager.Service.Impl;

import hr.inovatrend.petManager.Entities.Animal;
import hr.inovatrend.petManager.Repository.AnimalRepository;
import hr.inovatrend.petManager.Service.AnimalService;
import hr.inovatrend.petManager.Specifications.AnimalSpecificationBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public List<Animal> getAll( String search) {

        return animalRepository.findAll();

    }

    public Animal getAnimalById(Long id) {

        return animalRepository.findAnimalById(id);

    }

    @Override
    public void deleteAnimalById(Long id) {

        animalRepository.deleteById(id);

    }

    @Override
    public List<Animal> getByUserId(Long id) {

        return animalRepository.findByUserId(id);

    }

    @Override
    public List<Animal> getBySearch(Map<String, Object> search) {
        AnimalSpecificationBuilder builder = new AnimalSpecificationBuilder();

        for (String key : search.keySet()) {
            String operator = key.split("\\w+")[1];
            Object value = search.get(key);
            key = key.split(operator)[0];
            builder.with(key, operator, value);
        }

        Specification<Animal> spec = builder.build();
        return animalRepository.findAll(spec);
    }


}
