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
        private String addUserToDB(Model model){

    model.addAttribute("user", new User());
    return "user/add-user";

}

    @PostMapping("/add")
    private String createUser(@ModelAttribute User user){

    userService.createUser(user);

    return "redirect:/";
    }



}
