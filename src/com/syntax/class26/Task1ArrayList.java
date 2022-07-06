package com.syntax.class26;

import java.util.ArrayList;

public class Task1ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Pavlo");
        names.add("Khrystyna");
        names.add("Sasha");
        names.add("Malvina");
        names.add("Ruslan");

        if (!names.isEmpty()) {
            if (names.contains("Pavlo")) {
                System.out.println("It is true");
            } else {
                System.out.println("print correct info");
            }
            System.out.println("Size of array is " + names.size());
        }
    }
}
