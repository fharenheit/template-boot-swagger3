package io.datadynamics.template.swagger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

    @GetMapping("welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to Swagger");
    }

}
