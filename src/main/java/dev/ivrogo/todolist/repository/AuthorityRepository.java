package dev.ivrogo.todolist.repository;

import dev.ivrogo.todolist.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
