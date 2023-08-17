package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд передвигается по рельсам.");
    }

    @Override
    public void speed() {
        System.out.println("Максимальная скорость обычных поездов до 140 км/ч.");
    }
}
