package com.projetositee.williamjava;

import java.time.Instant;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
            "aplicacao", "william-java",
            "mensagem", "Pipeline Jenkins funcionando!",
            "timestamp", Instant.now().toString()
        );
    }
}

