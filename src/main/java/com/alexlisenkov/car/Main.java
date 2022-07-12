package com.alexlisenkov.car;

public class Main {

    public static void main(String[] args) {
        Car nissan = new Car("green", 180, 12, "almera", false);
        Car avtovas = new Car("green", 120, 11, "largus", false);
        Car toyota = new Car("black", 15, 200, "crown", true);
        Car mitsubisi = new Car();

        boolean safetyOfNissan = nissan.isCarSafe();
        boolean safetyOfAvtovas = avtovas.isCarSafe();
        boolean safetyOfToyota = toyota.isCarSafe();

        nissan.checkForBeaty();
        toyota.checkForBeaty();
        avtovas.checkForBeaty();

        nissan.speedLimit(200);
        toyota.speedLimit(200);
        avtovas.speedLimit(200);
        System.out.println("Максимально допустимая законом скорость для" + " nissan " + nissan.maxAvaliableSpeed);
        System.out.println("Максимально допустимая законом скорость для" + " toyota " + toyota.maxAvaliableSpeed);
        System.out.println("Максимально допустимая законом скорость для" + " avtovas " + avtovas.maxAvaliableSpeed);

        nissan.checkForFuel(12);
        toyota.checkForFuel(15);
        avtovas.checkForFuel(9);
    }
}