package com.syntax.class29;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/Bro.properties";
        //we need to have a special software that understand that file that we can
        //use to open and edit that file
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
    }
}
