package com.simuldiesel.remote.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    private final String serviceName;

    public HealthService(@Value("${spring.application.name}") String serviceName) {
        this.serviceName = serviceName;
    }

    public Map<String, String> getHealth() {
        return Map.of(
                "status", "UP",
                "service", serviceName
        );
    }
}
