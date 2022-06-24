package com.syntax.class18;

public class Task5Students {
    String name;
    double historyGrade;
    double mathGrade;
    double biologyGrade;


Task5Students(String name, double historyGrade, double mathGrade, double biologyGrade){
    this.name=name;
    this.mathGrade=mathGrade;
    this.biologyGrade=biologyGrade;
    this.historyGrade=historyGrade;
}
public double average() {
        return ((historyGrade+mathGrade+biologyGrade)/3);
    }
    public void printAllInfo(){
        System.out.println("Name = "+name+"History = "+historyGrade+" Math = "+mathGrade+
                " Biology= "+biologyGrade +"Average = "+average());
    }

}
