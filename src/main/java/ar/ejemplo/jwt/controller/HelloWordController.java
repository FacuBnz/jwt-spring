package ar.ejemplo.jwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "*")
public class HelloWordController {

    @GetMapping("hello")
    public String helloWord(@RequestParam(value = "name", defaultValue = "world") String name){
        return "Hello "+ name + " !! ";
    }
}
