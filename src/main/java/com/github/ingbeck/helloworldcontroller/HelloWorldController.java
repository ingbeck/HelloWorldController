package com.github.ingbeck.helloworldcontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWorldController {



    @GetMapping
    public String getHello(){
        return "HelloWorld";
    }
    //Output: 1 HelloWorld

    @GetMapping("/{name}")
    public String getHello(@PathVariable String name){
        return "Hello, " + name;
    }//Output: 1 Hello, ingo

}
