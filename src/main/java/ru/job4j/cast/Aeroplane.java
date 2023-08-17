package ru.job4j.cast;

public class Aeroplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летает по воздуху.");
    }

    @Override
    public void speed() {
        System.out.println("Средняя скорость составляет от 500 до 900 км/ч.");
    }
}
