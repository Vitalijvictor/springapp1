package ru.slivnojs.springcourse;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() { //фабричный метод вызова
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Do my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Do my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
