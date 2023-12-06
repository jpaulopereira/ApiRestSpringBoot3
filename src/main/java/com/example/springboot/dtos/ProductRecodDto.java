package com.example.springboot.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRecodDto(@NotBlank String name, @NotNull BigDecimal value) {

     
}
