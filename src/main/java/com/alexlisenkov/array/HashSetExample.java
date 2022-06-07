package com.alexlisenkov.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet Example
        Set<String> setExampleList = new HashSet<>();
        setExampleList.add("собака");
        setExampleList.add("кошка");
        setExampleList.add("тигр");
        setExampleList.add("слон");
        setExampleList.add("дельфин");

        System.out.println(setExampleList);

        Set<String> linkedStringList = new LinkedHashSet<>();
        linkedStringList.add("собака");
        linkedStringList.add("кошка");
        linkedStringList.add("тигр");
        linkedStringList.add("слон");
        linkedStringList.add("дельфин");

        System.out.println(linkedStringList);

        Set<String> treeSetExample = new TreeSet<>();
        treeSetExample.add("собака");
        treeSetExample.add("кошка");
        treeSetExample.add("тигр");
        treeSetExample.add("слон");
        treeSetExample.add("дельфин");

        System.out.println(treeSetExample);

    }
}
