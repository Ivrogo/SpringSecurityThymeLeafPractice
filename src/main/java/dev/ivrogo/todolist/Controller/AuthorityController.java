package dev.ivrogo.todolist.Controller;

import dev.ivrogo.todolist.dto.AuthorityDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface AuthorityController {

    String getAuthorities(Model model);

    AuthorityDto getAuthorityById(@PathVariable Integer id);
}
