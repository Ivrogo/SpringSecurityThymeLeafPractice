package dev.ivrogo.todolist.Controller;

import dev.ivrogo.todolist.dto.UserDto;
import dev.ivrogo.todolist.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController{

    private UserService userService;
    @Override
    @GetMapping("/users")
    public List<UserDto> getUsers() {
        return userService.getAllusers();
    }

    @Override
    @GetMapping("/users/{id}")
    public UserDto getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
}
