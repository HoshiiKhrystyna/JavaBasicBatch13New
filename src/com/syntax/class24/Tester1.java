package com.syntax.class24;

public class Tester1 {
public static void main (String [] args){
    File [] file={new JavaFile(),new WordFile(),new PdfFile()};
    for(File f:file){
        f.open();
        f.edit();
        f.close();
    }
}
}
