package com.simbirsoft;

public class Car {
    String color;   //class fields или поля класса
    int maxSpeed;
    int fuelConsumption;
    String brand;
    boolean isSafeCar;
    int maxAvaliableSpeed;
    String [] parameters = {"weight", "height", "length", "width"}; //пример массива


    public Car(String color, int maxSpeed, int fuelConsumption, String brand, boolean isSafeCar) {
        this.color = color;
        this.maxSpeed = maxSpeed;
 //       this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.isSafeCar = isSafeCar;
    } //конструктор с набором свойств для инциализации при создании (ALT + Insert для вызова)

    public Car() {
    } //пустой конструктор для создания объекта класса без инициализации (ALT + Insert для вызова)




    void speedLimit (int limit) {        //void ничего не возвращает. если у метода есть параметр, то вызвать его не передав параметр нельзя.
        this.maxAvaliableSpeed = limit;  //this это ссылка на тот объект, для которого вызывается метод или конструктор. обязателен если название параметра совпадает с названием свойства
    }



    boolean isCarSafe() {   //метод это описание поведения объекта
        if (isSafeCar) {
            System.out.println("Машина безопасна");
        } else {
            System.out.println("Машина не безопасна");
        }
        return isSafeCar; //после return выполнение метода прекращается
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


    void checkForFuel (int count1) {
        System.out.println("Расход машины:");
        if (fuelConsumption >= 15) {
            System.out.println("Довольно большой");
        } else if (fuelConsumption < 15 && fuelConsumption >= 10){
            System.out.println("Средний");
        } else if (fuelConsumption < 10){
            System.out.println("Экономичный");
        }
    }


}






