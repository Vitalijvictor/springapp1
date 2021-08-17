package ru.slivnojs.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBean2")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
