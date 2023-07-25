package com.alibou.keycloak;

import com.alibou.keycloak.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/login")
public class LoginController {

    @GetMapping
//    @PreAuthorize("hasRole('client_user')")
    public String login(@RequestBody UserDTO userDTO) {



        return "Hello from Spring boot & Keycloak";
    }

    @GetMapping("/hello-2")
//    @PreAuthorize("hasRole('client_admin')")
    public String hello2() {
        return "Hello from Spring boot & Keycloak - ADMIN";
    }
}

// Login contr return token
// validate token
// docu keycloak, keyvault