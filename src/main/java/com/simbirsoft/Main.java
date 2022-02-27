package com.simbirsoft;

import static java.awt.Color.green;

public class Main {


    public static void main(String[] args) {
       Car nissan = new Car("green", 180, 12, "almera", false );
       Car toyota = new Car("black", 200, 15, "crown", true);



       nissan.isCarSafe(false);
       nissan.checkForBeauty("");
       toyota.isCarSafe(true);
       toyota.checkForBeauty("black");

        System.out.println("Ниссан это безопасная машина");

    }

    }

