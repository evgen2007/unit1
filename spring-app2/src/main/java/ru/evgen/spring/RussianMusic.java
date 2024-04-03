package ru.evgen.spring;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class RussianMusic implements Music {
    private List<String> songs = new ArrayList<>();
    //    Блок инициализации объекта,
//    выполняется каждый раз, когда создается объект класса
    {
        songs.add("ДДТ. Осень");
        songs.add("Я спросил у ясеня");
        songs.add("Русский рок");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
