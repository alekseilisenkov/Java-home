package com.simbirsoft;

public class Car {
    String color;
    int maxSpeed;
    int fuelConsumption;
    String brand;
    boolean isSafeCar;


    public Car(String color, int maxSpeed, int fuelConsumption, String brand, boolean isSafeCar) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.isSafeCar = isSafeCar;
    } //конструктор с набором свойств для инциализации при создании

    public Car() {
    } //пустой конструктор для создания объекта класса без инициализации

    public void checkForBeauty(String color) {
        if (color == "black") {
            System.out.println(color + "цвет не красивый");
        } else {
            System.out.println(color + "красивый цвет");
        }
    }


    boolean isCarSafe(boolean isSafeCar) {
        if (isSafeCar) {
            System.out.println("Машина безопасна");
        } else {
            System.out.println("Машина не безопасна");
        }
        return isSafeCar;
    }
}






