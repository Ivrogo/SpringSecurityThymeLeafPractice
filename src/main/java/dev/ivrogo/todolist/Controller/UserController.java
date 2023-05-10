package dev.ivrogo.todolist.Controller;

import dev.ivrogo.todolist.dto.UserDto;
import org.springframework.ui.Model;

import java.util.List;

public interface UserController {

    String getUsers(Model model);

    UserDto getUserById(Integer id);
}
