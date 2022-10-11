package hr.inovatrend.petManager.Controller;


import hr.inovatrend.petManager.Entities.Animal;
import hr.inovatrend.petManager.Entities.AnimalType;
import hr.inovatrend.petManager.Service.AnimalService;
import hr.inovatrend.petManager.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("users",userService.getAll());
        return "animal/add-animal";

    }

    @PostMapping("/add")
    private String createAnimal(@ModelAttribute Animal animal) {

        animalService.saveAnimal(animal);
        return "redirect:/animal/all";
    }


    @GetMapping("/all")
    private String allAnimals(Model model) {

        model.addAttribute("animals", animalService.getAll());


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
    private String animalEdit(@PathVariable("id") Long id, @ModelAttribute Animal animal){

        animalService.saveAnimal(animal);

        return "redirect:/animal/info/{id}";
    }

    @GetMapping("/delete/{id}")
    private String deleteAnimal(@PathVariable("id") Long id){

         animalService.deleteAnimalById(id);

         return "redirect:/animal/all";

    }


}
