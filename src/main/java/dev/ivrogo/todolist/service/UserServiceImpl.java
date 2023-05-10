package dev.ivrogo.todolist.service;

import dev.ivrogo.todolist.dto.UserDto;
import dev.ivrogo.todolist.mapper.UserMapper;
import dev.ivrogo.todolist.model.User;
import dev.ivrogo.todolist.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private  UserMapper userMapper;
    @Override
    public UserDto getLoginUser() {
        return userMapper.userEntityToDto(userRepository.findLoginUser().orElse(null));
    }

    @Override
    public UserDto getUserById(Integer id) {
        return userMapper.userEntityToDto(userRepository.findById(id).orElse(null));
    }

    @Override
    public List<UserDto> getAllusers() {
        return userMapper.userListEntityToDto(userRepository.findAll());
    }

    @Override
    public UserDto createUser(User user) {
        return userMapper.userEntityToDto(userRepository.save(user));
    }

    @Override
    public UserDto updateUser(User user) {
        return userMapper.userEntityToDto(userRepository.save(user));
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
