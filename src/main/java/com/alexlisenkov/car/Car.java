package com.alexlisenkov.car;

public class Car {

    String color;
    int maxSpeed;
    int fuelConsumption;
    String brand;
    boolean isSafeCar;
    int maxAvaliableSpeed;
    String[] parameters = {"weight", "height", "length", "width"};

    public Car(String color, int maxSpeed, int fuelConsumption, String brand, boolean isSafeCar) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.isSafeCar = isSafeCar;
    }

    public Car() {
    }

    void speedLimit(int limit) {
        this.maxAvaliableSpeed = limit;
    }

    boolean isCarSafe() {
        if (isSafeCar) {
            System.out.println("Машина безопасна");
        } else {
            System.out.println("Машина не безопасна");
        }
        return isSafeCar;
    }

    Car checkForBeaty() {
        System.out.println("Эта машина:");
        if (color == "green") {
            System.out.println("Красивая");
        } else {
            System.out.println("Не красивая");
        }
        return this;
    }

    void checkForFuel(int count1) {
        System.out.println("Расход машины:");
        if (fuelConsumption >= 15) {
            System.out.println("Довольно большой");
        } else if (fuelConsumption < 15 && fuelConsumption >= 10) {
            System.out.println("Средний");
        } else if (fuelConsumption < 10) {
            System.out.println("Экономичный");
        }
    }
}