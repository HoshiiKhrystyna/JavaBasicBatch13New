package com.syntax.class26;

public class Person5 {
    private String fristname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public Person5(String fristname, String lastname, int birthmonth,
                   int birthday, int birthyear, String ssn) {
        this.fristname = fristname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFristname() {
        return fristname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getBirthmonth() {
        return birthmonth;
    }
    public int getBirthday() {
        return birthday;
    }
    public int getBirthyear() {
        return birthyear;
    }
    public String getSsn() {
        return ssn;
    }
    public String formatBirthday(){
        return birthday+"/"+birthmonth+"/"+birthyear;

    }

    public static void main(String[] args) {
        Person5 person5=new Person5("John","Doe",10,25,1900,"123-45-6789");
        System.out.println(person5.getFristname());
        System.out.println(person5.getLastname());
        System.out.println(person5.formatBirthday());
        System.out.println(person5.getSsn());



    }
}
