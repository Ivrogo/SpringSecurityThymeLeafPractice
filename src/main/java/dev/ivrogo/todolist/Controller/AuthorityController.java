package dev.ivrogo.todolist.Controller;

import dev.ivrogo.todolist.dto.AuthorityDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface AuthorityController {

    List<AuthorityDto> getAuthorities();

    AuthorityDto getAuthorityById(@PathVariable Integer id);
}
