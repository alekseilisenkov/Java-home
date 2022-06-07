package com.alexlisenkov.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleArrayExamples {

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "white";
        colors[3] = "black";
        colors[4] = "green";

        System.out.println(Arrays.toString(colors));

        List<String> stringList = new ArrayList<>();
        stringList.add("Весна");
        stringList.add("Summer");
        stringList.add(2, "Autumn");
        stringList.add(3, "Winter");
        stringList.set(0, "Spring");

        System.out.println(stringList.get(0));
        System.out.println(stringList.contains("Spring"));

    }
}
