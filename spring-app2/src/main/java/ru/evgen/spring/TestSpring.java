package ru.evgen.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayerSingle = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayerSingle.playMusic(Genre.CLASSICAL);
        musicPlayerSingle.playMusic(Genre.ROCK);
        musicPlayerSingle.playMusic(Genre.RUSSIANROCK);
        context.close();
    }
}
