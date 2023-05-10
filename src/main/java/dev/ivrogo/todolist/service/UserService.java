package dev.ivrogo.todolist.service;

import dev.ivrogo.todolist.dto.UserDto;
import dev.ivrogo.todolist.model.User;

import java.util.List;

public interface UserService {

     UserDto getLoginUser();

     UserDto getUserById(Integer id);

     List<UserDto> getAllusers();

     UserDto createUser(User user);

     UserDto updateUser(User user);

     void deleteUser(User user);


}
