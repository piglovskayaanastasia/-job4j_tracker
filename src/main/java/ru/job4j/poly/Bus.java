package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Ехать.");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Число пассажиров: " + passenger);
    }

    @Override
    public int refuel(int fuel, int price) {
        return fuel * price;
    }
}
