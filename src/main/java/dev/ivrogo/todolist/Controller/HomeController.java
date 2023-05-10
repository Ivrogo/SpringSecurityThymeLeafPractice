package dev.ivrogo.todolist.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;

public interface HomeController {

    String home(Model model, Authentication authentication);

    String login(Model model);

    String loginError(Model model);
}
