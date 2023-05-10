package dev.ivrogo.todolist.service;

import dev.ivrogo.todolist.dto.AuthorityDto;
import dev.ivrogo.todolist.mapper.AuthorityMapper;
import dev.ivrogo.todolist.model.Authority;
import dev.ivrogo.todolist.repository.AuthorityRepository;

import java.util.List;

public class AuthorityServiceImpl implements AuthorityService{

    private AuthorityRepository authorityRepository;
    private AuthorityMapper authorityMapper;
    @Override
    public AuthorityDto getAuthorityById(Integer id) {
        return authorityMapper.authorityEntityToDto(authorityRepository.findById(id).orElse(null));
    }

    @Override
    public List<AuthorityDto> getAllAuthorities() {
        return authorityMapper.authorityListEntityToDto(authorityRepository.findAll());
    }

    @Override
    public AuthorityDto createAuthority(Authority authority) {
        return authorityMapper.authorityEntityToDto(authorityRepository.save(authority));
    }

    @Override
    public AuthorityDto updateAuthority(Authority authority) {
        return authorityMapper.authorityEntityToDto(authorityRepository.save(authority));
    }

    @Override
    public void deleteAuthority(Authority authority) {
        authorityRepository.delete(authority);
    }
}
