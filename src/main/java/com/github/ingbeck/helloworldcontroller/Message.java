package com.github.ingbeck.helloworldcontroller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private String name;
    private String message;
    private String id;

}
