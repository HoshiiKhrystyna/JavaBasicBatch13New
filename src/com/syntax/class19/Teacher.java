package com.syntax.class19;

public class Teacher {
    String name;
    String subject;
    int workExperience;

    public void printInfo(){
        System.out.println("Teachers name is "+name+" subject is "+subject+" work experiance is "+workExperience+" years");
    }
}class MathTeacher extends Teacher{
    MathTeacher(String name, String subject,int workExperience){
        this.name=name;
        this.subject=subject;
        this.workExperience=workExperience;
    }

}class ChemistryTeacher extends Teacher {
    ChemistryTeacher(String name, String subject, int workExperience) {
        this.name = name;
        this.subject = subject;
        this.workExperience = workExperience;
    }
}class PianoTeacher extends Teacher {
    PianoTeacher(String name, String subject, int workExperience) {
        this.name = name;
        this.subject = subject;
        this.workExperience = workExperience;
    }
}
class TesterTeachers {
    public static void main(String[] args) {
        MathTeacher math = new MathTeacher("Pavlo", "math", 30);
        math.printInfo();
        ChemistryTeacher chemistry = new ChemistryTeacher("Khrystyna", "chemistry", 40);
chemistry.printInfo();
        PianoTeacher piano=new PianoTeacher("Oleksandr", "piano", 20);
piano.printInfo();
    }
}