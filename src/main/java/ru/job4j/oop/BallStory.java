package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Here here = new Here();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        here.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
