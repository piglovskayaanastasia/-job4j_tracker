package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle aeroplane = new Aeroplane();
        Vehicle train = new Train();
        Vehicle autobus = new Autobus();

        Vehicle[] vehicles = new Vehicle[] {aeroplane, train, autobus};
        for (Vehicle a : vehicles) {
            a.move();
            a.speed();
        }
    }
}
