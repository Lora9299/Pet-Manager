package hr.inovatrend.petManager.Service.Impl;

import hr.inovatrend.petManager.Entities.Animal;
import hr.inovatrend.petManager.Repository.AnimalRepository;
import hr.inovatrend.petManager.Service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    public Animal saveAnimal(Animal animal){
        return animalRepository.save(animal);
    }

    public List<Animal> getAll(){

        return animalRepository.findAll();

    }
    public Animal getAnimalById(Long id){

        return animalRepository.findAnimalById(id);

    }

    @Override
    public void deleteAnimalById(Long id) {

        animalRepository.deleteById(id);

    }

    @Override
    public List<Animal> getByUserId(Long id){

        return animalRepository.findByUserId(id);

    }
}
