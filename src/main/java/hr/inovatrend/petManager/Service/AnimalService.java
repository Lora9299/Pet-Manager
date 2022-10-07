package hr.inovatrend.petManager.Service;

import hr.inovatrend.petManager.Entities.Animal;

import java.util.List;

public interface AnimalService {

    Animal createAnimal(Animal animal);

    List<Animal> getAll();

}
