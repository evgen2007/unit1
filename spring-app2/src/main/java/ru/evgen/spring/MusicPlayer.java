package ru.evgen.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RussianMusic russianMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RussianMusic russianMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.russianMusic = russianMusic;
    }

    public void playMusic(Genre genre){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (genre == Genre.CLASSICAL) {
            System.out.println("Playing Single: " + classicalMusic.getSong().get(randomNumber));
        } else if (genre == Genre.ROCK) {
            System.out.println("Playing Single: " + rockMusic.getSong().get(randomNumber));
        } else
        {
            System.out.println("Playing Single: " + russianMusic.getSong().get(randomNumber));
        }
    }
}
