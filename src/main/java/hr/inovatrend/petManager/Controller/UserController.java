package hr.inovatrend.petManager.Controller;


import hr.inovatrend.petManager.Entities.User;
import hr.inovatrend.petManager.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/user")
@SessionAttributes("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/add")
    private String addUserToDB(Model model) {

        model.addAttribute("user", new User());
        return "user/add-user";

    }

    @PostMapping("/add")
    private String createUser(@ModelAttribute User user) {

        userService.createUser(user);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    private String editUser(@PathVariable("id") Long id, Model model) {


        User user = userService.getUserById(id);

        model.addAttribute("user", user);

        return "/user/edit-user";

    }

    @PostMapping("/edit/{id}")
    private String userEdit(@PathVariable("id") Long id, @ModelAttribute User user) {

        userService.createUser(user);

        return "redirect:/";
    }


        @GetMapping("/delete/{id}")
        private String deleteUser(@PathVariable("id") Long id) {

            userService.deleteUserById(id);

            return "redirect:/user/all";
        }

    @GetMapping("/all")
    private String allUsers(Model model){

       model.addAttribute("users", userService.getAll());

        return"/user/all-users";
    }


}
