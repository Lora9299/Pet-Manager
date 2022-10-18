package hr.inovatrend.petManager.Controller;


import hr.inovatrend.petManager.Entities.Animal;
import hr.inovatrend.petManager.Entities.AnimalType;
import hr.inovatrend.petManager.Entities.Enums.Operators;
import hr.inovatrend.petManager.Entities.ResultAnimal;
import hr.inovatrend.petManager.Service.AnimalService;
import hr.inovatrend.petManager.Service.UserService;
import hr.inovatrend.petManager.Specifications.AnimalSpecification;
import hr.inovatrend.petManager.Specifications.AnimalSpecificationBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/animal")
@SessionAttributes("animal")
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;
    private final UserService userService;

    @GetMapping("/add")
    private String saveAnimal(Model model) {

        model.addAttribute("animal", new Animal());
        model.addAttribute("types", AnimalType.values());
        model.addAttribute("users", userService.getAll());
        return "animal/add-animal";

    }

    @PostMapping("/add")
    private String createAnimal(@ModelAttribute Animal animal) {

        animalService.saveAnimal(animal);
        return "redirect:/animal/all";
    }


    @GetMapping("/all")
    private String allAnimals(Model model, @Param("search") String search) {

        model.addAttribute("animals", animalService.getAll(search));

        return "/animal/all-animals";

    }

    @GetMapping("/info/{id}")
    private String infoAnimal(@PathVariable("id") Long id, Model model) {

        Animal animal = animalService.getAnimalById(id);

        model.addAttribute("animals", animal);


        return "/animal/info-animal";
    }

    @GetMapping("edit/{id}")
    private String editAnimal(@PathVariable("id") Long id, Model model) {

        Animal animal = animalService.getAnimalById(id);
        model.addAttribute("animal", animal);
        model.addAttribute("types", AnimalType.values());


        return "/animal/edit-animal";

    }

    @PostMapping("edit/{id}")
    private String animalEdit(@PathVariable("id") Long id, @ModelAttribute Animal animal) {

        animalService.saveAnimal(animal);

        return "redirect:/animal/info/{id}";
    }

    @GetMapping("/delete/{id}")
    private String deleteAnimal(@PathVariable("id") Long id) {

        animalService.deleteAnimalById(id);

        return "redirect:/animal/all";

    }

    @GetMapping("/search")
    private String search(String search, Model model) {

        model.addAttribute("animal", new ResultAnimal());
        model.addAttribute("types", AnimalType.values());
        model.addAttribute("operators", Operators.values());
        List<Animal> test = animalService.getBySearch(search);
        return "/animal/search-animal";
    }

    @PostMapping("/result")
    private String result(@ModelAttribute ResultAnimal animal, Model model) {

        StringBuilder results = new StringBuilder();

        if (!animal.getName().isEmpty() && animal.getName() != null) {
            results.append("name:" + animal.getName() + ",");
        }
        if (animal.getHeight() != null) {

            results.append("height" + animal.getOperatorHeight().getDisplayValue() + animal.getHeight() + ",");

        }
        if (animal.getWeight() != null) {
            results.append("weight" + animal.getOperatorWeight().getDisplayValue() + animal.getWeight() + ",");
        }
        if (animal.getAnimal() != null) {
            results.append("animal:\"" + animal.getAnimal() + "\",");
        }
        if (animal.getAge() != null) {
            results.append("age" + animal.getOperatorAge().getDisplayValue() + animal.getAge() + ",");
        }  /*if ( animal.getValued() != null) {
            results.append("valued.price" + animal.getOperatorValued().getDisplayValue() + animal.getValued().getPrice() + ",");
        }*/


        String concreteResults = results.deleteCharAt(results.toString().length()-1).toString();

        List<Animal> animals = animalService.getBySearch(concreteResults);

        model.addAttribute("animals", animals);

        return "/animal/search-result-animals";

    }


}
