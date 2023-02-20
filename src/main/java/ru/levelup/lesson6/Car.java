package ru.levelup.lesson6;

import java.util.Objects;

public class Car implements Cloneable {

    private String model;
    private String marka;
    private Engine engine;

    public Car(Car car) throws CloneNotSupportedException {
        this.marka = car.marka;
        this.model = car.model;
        this.engine = (Engine) car.engine.clone();
    }

    public Car(String model, String marka) {
        this.model = model;
        this.marka = marka;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(marka, car.marka) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, marka, engine);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object result = super.clone();
        ((Car) result).setEngine((Engine) this.getEngine().clone());
        return result;
    }

    static class Engine implements Cloneable {
        private double volume;

        public Engine(double volume) {
            this.volume = volume;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Engine engine = (Engine) o;
            return Double.compare(engine.volume, volume) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(volume);
        }
    }
}
