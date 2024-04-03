package ru.evgen.spring;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();
    //    Блок инициализации объекта,
//    выполняется каждый раз, когда создается объект класса
    {
        songs.add("Wind cries Mary");
        songs.add("RockAndRoll");
        songs.add("RockRock");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
