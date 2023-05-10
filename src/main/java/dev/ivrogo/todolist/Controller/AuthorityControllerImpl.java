package dev.ivrogo.todolist.Controller;

import dev.ivrogo.todolist.dto.AuthorityDto;
import dev.ivrogo.todolist.service.AuthorityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthorityControllerImpl implements AuthorityController{

    private AuthorityService authorityService;
    @Override
    @GetMapping("/authorities")
    public List<AuthorityDto> getAuthorities() {
        return authorityService.getAllAuthorities();
    }

    @Override
    @GetMapping("/authorities/{id}")
    public AuthorityDto getAuthorityById(@PathVariable Integer id) {
        return authorityService.getAuthorityById(id);
    }
}
