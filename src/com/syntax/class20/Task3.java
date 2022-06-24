package com.syntax.class20;

public class Task3 {
    public static void main (String[] args){
      ChemistryTeacher chem=new ChemistryTeacher();
      chem.name="Pavlo";
      chem.specialChemSubject="Organic";
      chem.teacherChem();
    }
}
class Teacher{
    String name;
    String typeOfTeacher;
    void teaching(){
        System.out.println(name+"Teachers "+typeOfTeacher);
    }
}
class  MathTeacher extends Teacher{
    String specialMathSubject;
    public void teacherMath(){
        System.out.println(name+" "+"Teaches Math and his favourite math subject is "+specialMathSubject);
    }
}class ChemistryTeacher extends Teacher{
    String specialChemSubject;
    public void teacherChem(){
        System.out.println(name+" Teaches Chemistry and his favourite math subject is "+specialChemSubject);
    }
}
class PianoTeacher extends Teacher{
    String specialPianoSubject;
    public void teacherPiano(){
    System.out.println(name+" "+"Teaches Piano and his favourite math subject is ");
    }
}
