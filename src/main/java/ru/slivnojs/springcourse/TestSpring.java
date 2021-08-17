package ru.slivnojs.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music1 = context.getBean("musicBean1",
                Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        musicPlayer1.playMusic();

        Music music2 = context.getBean("musicBean2",
                Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();

        Music music3 = context.getBean("musicBean3",
                Music.class);
        MusicPlayer musicPlayer3 = new MusicPlayer(music3);
        musicPlayer3.playMusic();

        context.close();
    }
}
