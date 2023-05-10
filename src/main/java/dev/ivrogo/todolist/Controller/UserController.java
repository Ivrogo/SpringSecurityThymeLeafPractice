package dev.ivrogo.todolist.Controller;

import dev.ivrogo.todolist.dto.UserDto;

import java.util.List;

public interface UserController {

    List<UserDto> getUsers();

    UserDto getUserById(Integer id);
}
