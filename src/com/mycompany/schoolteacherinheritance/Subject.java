package com.mycompany.schoolteacherinheritance;

public class Subject extends Teacher{
    String subject;
    //Teacher teacher;


    public Subject(String subject,String teacher) {
        //super(teacher);
        this.subject = subject;
        super.setTeacher(teacher);
    }


    public String getSubject() {
        return subject;
    }
   /* public void setSubject(String subject){
        this.subject = subject;
    }*/
    /*public String getTeacher(){
        return this.teacher;
    }*/
    public void display(){
        System.out.println(this.teacher+" profession is "+super.getProfession()+ " in " +super.getSchoolName()+" school for the subject " +this.subject);
        //System.out.println(this.subject);

    }


}
   // public Subject(String subject){

