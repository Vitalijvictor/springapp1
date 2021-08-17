package ru.slivnojs.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBean3")
public class DanceMusic implements Music{
    @Override
    public String getSong() {
        return "Dirty Beats";
    }
}
