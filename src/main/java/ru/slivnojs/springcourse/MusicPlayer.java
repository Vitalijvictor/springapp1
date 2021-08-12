package ru.slivnojs.springcourse;

/**
 * inversion of control
 */
public class MusicPlayer {
    private Music music;
    //Ioc
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("playing: " + music.getSong());
    }
}
