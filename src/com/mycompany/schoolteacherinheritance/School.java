package com.mycompany.schoolteacherinheritance;

public class School {
    private String schoolName ="DAV";
    private String profession ="Teaching";

    public School() {
       // System.out.println("Default constructor of school class");
    }

    /*public void setSchool(String schoolName, String profession){
        this.schoolName = schoolName;
        this.profession = profession;
    }*/
    public String getSchoolName() {
        return (schoolName);
    }
    public String getProfession() {
        return (profession);//Why is this not reachable

    }
}
