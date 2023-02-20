package ru.levelup.lesson6;

public class CarRunner {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car octavia = new Car("Octavia", "Skoda");
        octavia.setEngine(new Car.Engine(1.4));
        Car golf = new Car("Golf", "VW");
//        octavia.setEngine(octavia.new Engine(1.4));
        System.out.println(octavia.equals(octavia.clone()));
    }

}
