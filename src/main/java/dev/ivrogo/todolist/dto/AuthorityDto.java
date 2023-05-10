package dev.ivrogo.todolist.dto;

import lombok.Builder;

@Builder
public record AuthorityDto(
        Integer id,
        String authority) {}
