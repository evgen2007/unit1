package ru.evgen.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestry() {
        System.out.println("Doing my Destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
