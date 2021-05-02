package com.mycompany.schoolteacherinheritance;

public class Teacher extends School{
    String teacher;

    public Teacher(String teacher) {
        this.teacher = teacher;
    }

    public Teacher() {
        super.getSchoolName();
        super.getProfession();
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public String getTeacher() {
        return teacher;
    }
}
