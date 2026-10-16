package com.paymentsd.plw;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class register {

    @GetMapping("/")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
