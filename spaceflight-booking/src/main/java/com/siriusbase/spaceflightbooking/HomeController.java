package com.siriusbase.spaceflightbooking;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Welcome on the Spaceflight Booking webpage";
    }

    @GetMapping(value = "/index")
    public ResponseEntity<String> index() {
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }
}
