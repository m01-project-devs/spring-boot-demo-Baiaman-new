package com.m01project.taskmanager.demo.dto;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;
@Value
@Builder
public class UserResponseDto {
    private final Long id;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final LocalDateTime createdAt;
}
