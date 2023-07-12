package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Ехать.");
    }

    @Override
    public int passengers(int passenger) {
        return 0;
    }

    @Override
    public int refuel(int fuel, int price) {
        return fuel * price;
    }
}
