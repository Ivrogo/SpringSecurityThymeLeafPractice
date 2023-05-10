package dev.ivrogo.todolist.Controller;

import dev.ivrogo.todolist.config.MySecurityUser;
import dev.ivrogo.todolist.dto.UserDto;
import dev.ivrogo.todolist.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;

@RestController
@RequiredArgsConstructor
public class HomeControllerImpl implements HomeController{

    private UserService userService;
    @Override
    @GetMapping("/")
    public String home(Model model, Authentication authentication) {
        if (authentication != null) {
            UserDto user = userService.getLoginUser();
            model.addAttribute("user", user);
        }
        model.addAttribute("title", "Home");
        return "index";
    }

    @Override
    public String login(Model model) {
        model.addAttribute("title", "Login");
        return "login";
    }

    @Override
    public String loginError(Model model) {
        model.addAttribute("title", "Login");
        model.addAttribute("loginError", true);
        return "login";
    }


}
