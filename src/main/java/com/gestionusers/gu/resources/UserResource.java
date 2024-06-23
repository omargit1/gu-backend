package com.gestionusers.gu.resources;

import com.gestionusers.gu.dto.UserDto;
import com.gestionusers.gu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    ResponseEntity<List<UserDto>> getAllUsers() {

        return  ResponseEntity.ok(userService.findAll());

    }
}
