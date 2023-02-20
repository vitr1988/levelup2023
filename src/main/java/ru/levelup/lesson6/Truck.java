package ru.levelup.lesson6;

public class Truck extends Car {

    public Truck(String model, String marka) {
        super(model, marka);
    }

    public void move() {
        Engine engine = getEngine();
    }
}
