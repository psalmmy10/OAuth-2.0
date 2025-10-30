package com.oauth_authorization_server.oauth_authorization_server.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/view/auth")
public class DemoController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello()
    {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/greet")
    public ResponseEntity<String> greeting()
    {
        return ResponseEntity.ok("Good day world");
    }
}
