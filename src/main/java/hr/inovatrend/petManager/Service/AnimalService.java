package hr.inovatrend.petManager.Service;

import hr.inovatrend.petManager.Entities.Animal;

import java.util.List;
import java.util.Map;

public interface AnimalService {

    Animal saveAnimal(Animal animal);

    List<Animal> getAll(String search);

    Animal getAnimalById(Long id);

    void deleteAnimalById(Long id);

    List<Animal> getByUserId(Long id);

    List<Animal>getBySearch(Map<String, Object> search);

}
