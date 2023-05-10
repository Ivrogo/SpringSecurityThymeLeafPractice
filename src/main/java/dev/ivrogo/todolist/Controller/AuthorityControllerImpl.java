package dev.ivrogo.todolist.Controller;

import dev.ivrogo.todolist.dto.AuthorityDto;
import dev.ivrogo.todolist.service.AuthorityService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
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
    public String getAuthorities(Model model) {
        List<AuthorityDto> authorities = authorityService.getAllAuthorities();
        model.addAttribute("title", "Authorities");
        model.addAttribute("authorities", authorities);
        return "authorities";
    }

    @Override
    @GetMapping("/authorities/{id}")
    public AuthorityDto getAuthorityById(@PathVariable Integer id) {
        return authorityService.getAuthorityById(id);
    }
}
