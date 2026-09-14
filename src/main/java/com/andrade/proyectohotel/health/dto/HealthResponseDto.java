package com.andrade.proyectohotel.health.dto;

public record HealthResponseDto(String status, String error) {
    public HealthResponseDto(String status){
        this(status, null);
    }
}