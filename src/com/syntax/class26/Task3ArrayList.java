package com.syntax.class26;

import java.util.ArrayList;

public class Task3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coffe");
        drinks.add("Tea");
        drinks.add("juice");
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.remove(i);
                drinks.add(i, "Water");
            }}
        System.out.println(drinks);

    }

        }





