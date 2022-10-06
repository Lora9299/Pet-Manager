package hr.inovatrend.petManager.Service.Impl;

import hr.inovatrend.petManager.Entities.Animal;
import hr.inovatrend.petManager.Repository.AnimalRepository;
import hr.inovatrend.petManager.Service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    public Animal createAnimal(Animal animal){
        return animalRepository.save(animal);
    }

}
