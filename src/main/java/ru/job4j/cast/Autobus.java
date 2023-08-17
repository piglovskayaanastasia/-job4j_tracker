package ru.job4j.cast;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус двигается по скоростным трассам.");
    }

    @Override
    public void speed() {
        System.out.println("Могут двигаться на всех дорогах со скоростью, не превышающей 90 км/ч.");
    }
}
