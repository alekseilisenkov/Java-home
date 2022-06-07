package com.alexlisenkov.array;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        Map<Integer, String> alphabet2 = new HashMap<>();
        alphabet2.put(0, "a");
        alphabet2.put(1, "b");
        alphabet2.put(2, "c");
        alphabet2.put(3, "d");
        alphabet2.put(4, "e");
        alphabet2.put(5, "f");
        alphabet2.put(6, "g");
        alphabet2.put(7, "h");
        alphabet2.put(8, "i");
        alphabet2.put(9, "j");
        alphabet2.put(10, "k");
        alphabet2.put(11, "l");
        alphabet2.put(12, "m");
        alphabet2.put(26, "z");

        System.out.println("Размер алфавита: " + alphabet2.size() + " символов.\n" + "\"Алфавит по порядку\"\n");
        for (HashMap.Entry<Integer, String> entries : alphabet2.entrySet())
            System.out.println(entries.getKey() + " - " + entries.getValue());


    }
}
