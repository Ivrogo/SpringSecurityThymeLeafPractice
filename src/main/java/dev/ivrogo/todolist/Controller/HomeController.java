package dev.ivrogo.todolist.Controller;

import org.springframework.security.core.Authentication;

public interface HomeController {

    String home();

    String user(Authentication authentication);

    String admin(Authentication authentication);

    String developer(Authentication authentication);
}
