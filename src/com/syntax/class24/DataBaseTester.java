package com.syntax.class24;

public class DataBaseTester {
    public static void main (String [] args){
        DataBase [] databases={new Informix(), new MySQLServer()
        };
        for(DataBase  data:databases){
            data.open();
            data.readData();
            data.writeData();
            data.closeTheDtaBase();
        }
    }
}
