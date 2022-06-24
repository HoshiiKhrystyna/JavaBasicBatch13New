package com.syntax.reviewClass2;

public class Doctor {
  public  String name;
   public  String lastName;
  protected  String speciality;
    int experience;
   private double salary;
    public static String hospital;

  public  Doctor(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }

    Doctor(String name, String lastName, String speciality, int experience){
        this(name, lastName);
        this.speciality=speciality;
        this.experience=experience;
    }

    public void printInfo(){
        System.out.println("Doctor name is "+name+" "+lastName+" and speciality is "+speciality);
    }
    protected void work(){
        System.out.println("Doctor name is "+name+" "+lastName+" works at "+hospital);
    }
    void treat(String patientName){
        this.printInfo();
        System.out.println(" treats patient "+patientName);
    }
    private void getPaid(){
        System.out.println("Doctor "+lastName+" gets pass "+salary);
    }
     public static void study(String university){
        System.out.println("Doctor studied at "+university+" and now works at "+hospital);
    }
}
