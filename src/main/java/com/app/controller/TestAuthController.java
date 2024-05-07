package com.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class TestAuthController {

    @GetMapping("/get")
    public String helloGet(){
        return "Hola mundo - GET";
    }

    @PostMapping("/post")
    public String helloPost(){
        return "Hola mundo - POST";
    }

    @PutMapping("/put")
    public String helloPut(){
        return "Hola mundo - PUT";
    }

    @DeleteMapping("/delete")
    public String helloDelete(){
        return "Hola mundo - DELETE";
    }

    @PatchMapping("/patch")
    public String helloPatch(){
        return "Hola mundo - PATCH";
    }
}
