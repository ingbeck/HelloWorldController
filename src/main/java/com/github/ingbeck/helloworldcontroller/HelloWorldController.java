package com.github.ingbeck.helloworldcontroller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/message")
public class HelloWorldController {


    private List<Message> messages = new ArrayList<>();

    public HelloWorldController(){
        messages.add(new Message("System", "Hier kommt deine Message an", "1"));
    }

    @GetMapping("/hello")
    public String getHello(){
        return "HelloWorld";
    }
    //Output: 1 HelloWorld

    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable String name){
        return "Hello, " + name;
    }//Output: 1 Hello, ingo

    @GetMapping()
    public List<Message> getMessages(){
        return messages;
    }

    @PostMapping()
    public List<Message> addMessage(@RequestBody Message message){
        messages.add(message);
        return messages;
    }

}
