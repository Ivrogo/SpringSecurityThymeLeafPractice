package dev.ivrogo.todolist.service;

import dev.ivrogo.todolist.dto.AuthorityDto;
import dev.ivrogo.todolist.model.Authority;

import java.util.List;

public interface AuthorityService {

    AuthorityDto getAuthorityById(Integer id);

    List<AuthorityDto> getAllAuthorities();

    AuthorityDto createAuthority(Authority authority);

    AuthorityDto updateAuthority(Authority authority);

    void deleteAuthority(Authority authority);

}
