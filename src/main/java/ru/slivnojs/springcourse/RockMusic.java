package ru.slivnojs.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBean1")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
