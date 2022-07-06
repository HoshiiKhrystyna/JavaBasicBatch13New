package com.syntax.class26;

import java.util.ArrayList;

public class Task5ArrayList {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Pavlo");
        words.add("face");
        words.add("three");
        for(int i=0; i<words.size(); i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);
    }
}
