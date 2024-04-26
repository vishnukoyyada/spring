package com.example.demo;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class  Hellocontroller{



    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }
}
