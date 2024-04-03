package ru.evgen.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/exit")
public class SecondController {

    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
