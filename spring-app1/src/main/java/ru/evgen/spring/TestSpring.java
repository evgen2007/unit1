package ru.evgen.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        // запуск через Single
        MusicPlayer musicPlayerSingle = context.getBean("musicPlayerSingle", MusicPlayer.class);
        musicPlayerSingle.playMusic();
        // запуск через ArrayList
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();
        context.close();
    }
}
