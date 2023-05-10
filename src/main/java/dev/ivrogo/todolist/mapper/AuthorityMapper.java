package dev.ivrogo.todolist.mapper;

import dev.ivrogo.todolist.dto.AuthorityDto;
import dev.ivrogo.todolist.model.Authority;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorityMapper {

    public AuthorityDto authorityEntityToDto(Authority authority) {
        return AuthorityDto.builder()
                .id(authority.getId())
                .authority(authority.getAuthority())
                .build();
    }

    public List<AuthorityDto> authorityListEntityToDto(List<Authority> authorities) {
        return authorities.stream()
                .map(authority -> authorityEntityToDto(authority))
                .toList();
    }

    public Authority authorityDtoToEntity(AuthorityDto authority) {
        return Authority.builder()
                .id(authority.id())
                .authority(authority.authority())
                .build();
    }

    public List<Authority> authorityListDtoToEntity(List<AuthorityDto> authorities) {
        return authorities.stream()
                .map(authority -> authorityDtoToEntity(authority))
                .toList();
    }

}
