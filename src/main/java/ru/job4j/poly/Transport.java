package ru.job4j.poly;
/** интерфейс будет определять любой вид транспорта **/
public interface Transport {

    void drive();

    int passengers(int passenger);

    int refuel(int fuel, int price);
}
