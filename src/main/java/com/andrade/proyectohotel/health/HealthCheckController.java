package com.andrade.proyectohotel.health;

import com.andrade.proyectohotel.health.dto.HealthResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheckController {
    @GetMapping("/health")
    public ResponseEntity<HealthResponseDto> getHealth() {
        try {
            return ResponseEntity.ok(new HealthResponseDto("up"));
        } catch (Exception e) {
            HealthResponseDto errorResponse = new HealthResponseDto("DOWN", e.getMessage());
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(errorResponse);
        }
    }
}
