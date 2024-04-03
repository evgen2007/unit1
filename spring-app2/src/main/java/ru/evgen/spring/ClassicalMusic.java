package ru.evgen.spring;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();
//    Блок инициализации объекта,
//    выполняется каждый раз, когда создается объект класса
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Moon sonata");
        songs.add("K Eliese");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
