package dev.ivrogo.todolist.Controller;

import dev.ivrogo.todolist.config.MySecurityUser;
import dev.ivrogo.todolist.dto.UserDto;
import dev.ivrogo.todolist.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;

@RestController
@RequiredArgsConstructor
public class HomeControllerImpl implements HomeController{

    private UserService userService;
    @Override
    @GetMapping("/")
    public String home() {
        return """
                <h1>Welcome home</h1>
                <a href="/user"</a><br/>
                <a href="/admin"</a><br/>
                <a href="/developer"</a>
                """;
    }

    @Override
    @GetMapping("/user")
    public String user(Authentication authentication) {
        UserDto userDto = userService.getLoginUser();
        return """
                <h1>Welcome User!</h1>
                <h2>%s</h2>
                <h3>%s</h3>
                """.formatted(authentication.getName(), userDto);
    }

    @Override
    @GetMapping("/admin")
    public String admin(Authentication authentication) {
        MySecurityUser mySecurityUser = (MySecurityUser) authentication.getPrincipal();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return """
                <h1>Welcome Admin!</h1>
                <h2>%s</h2>
                <p>MyUser:<br/>
                User name: %s<br/>
                Full name: %s<br/>
                E-Mail: %s<br/>
                Birthday: %s<br/>
                Authorities: %s
                </p>
                """.formatted(authentication.getName(),
                mySecurityUser.getUsername(),
                mySecurityUser.getFullname(),
                mySecurityUser.getEmailaddress(),
                mySecurityUser.getBirthdate().format(dateTimeFormatter),
                mySecurityUser.getAuthorities()
        );
    }

    @Override
    @GetMapping("/developer")
    public String developer(Authentication authentication) {
        UserDto userDto = userService.getLoginUser();
        return """
                <h1>Welcome Developer!</h1>
                <h2>%s</h2>
                <h3>%s</h3>
                """.formatted(authentication.getName(), userDto);
    }
}
