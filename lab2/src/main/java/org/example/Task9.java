package org.example;

public class Task9 {
    public static class Car {
        private final double consumption;
        private double X;
        private double fuelLevel;

        public Car(double consumption) {
            this.consumption = consumption;
            this.fuelLevel = 0;
            this.X = 0;
        }

        public void drive(double distance) {
            distance = Math.abs(distance);
            X += Math.min(distance, fuelLevel * consumption);
            fuelLevel = Math.max(0, fuelLevel - distance / consumption);
        }

        public void refuelCar(double fuel) {
            this.fuelLevel += fuel;
        }

        public double getX() {
            return X;
        }

        public double getFuelLevel() {
            return fuelLevel;
        }

        @Override
        public String toString() {
            return "Car : " +
                    "consumption = " + consumption +
                    ", X = " + X +
                    ", fuel = " + fuelLevel;
        }
    }

    public static void main(String[] args) {
        Car car = new Car(8);
        System.out.println(car);
        car.drive(-12.0);
        System.out.println(car);
        car.refuelCar(2);
        System.out.println(car);
        car.drive(17);
        System.out.println(car);
    }
}
