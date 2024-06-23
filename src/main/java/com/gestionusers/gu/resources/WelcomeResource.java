package com.gestionusers.gu.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeResource {


    @GetMapping("")
    ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Hello , welcome !");
    }
}
