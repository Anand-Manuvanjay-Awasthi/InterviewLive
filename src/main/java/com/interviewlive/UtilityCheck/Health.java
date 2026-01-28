package com.interviewlive.UtilityCheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @GetMapping("/health")
    public String healthCheck() {
        return "Chl rha hai";
    }
}
