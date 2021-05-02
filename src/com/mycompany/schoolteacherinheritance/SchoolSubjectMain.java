package com.mycompany.schoolteacherinheritance;

import java.util.Scanner;

public class SchoolSubjectMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Subject s1 = null;
        Subject s2[] = new Subject[2];
        for(int i =0;i<s2.length;i++) {
            //s1= new Subject();
            System.out.println("Enter the subject name");
            String subject = sc.nextLine();
            System.out.println("Enter the teacher name");
            String teacher = sc.nextLine();
            s1 = new Subject(subject,teacher);
            //s1.display();
            s2[i] = s1;

        }
        for(int i=0;i<s2.length;i++){
            s2[i].display();
        }

        /*Scanner sc = new Scanner(System.in);
        Subject s = new Subject();
        Teacher teacher = null;
        Subject subject = null;
        Teacher teachers[] = null;
        Subject subjects[] = null;
        int noOfSubject;
        int noOfTeacher;
        System.out.println("Enter the number of subject");
        noOfSubject = sc.nextInt();
        sc.nextLine();
        subjects =new Subject[noOfSubject];
        System.out.println("Enter the number of Teacher");
        noOfTeacher = sc.nextInt();
        sc.nextLine();
        teachers = new Teacher[noOfTeacher];
        System.out.println("Enter the name of " +noOfTeacher +" Teacher");
        for(int i =0; i<noOfSubject;i++){
            teacher = new Teacher();
            //teachers[i] = new Teacher();
            System.out.println("Enter the name of teacher "+(i+1));
            String teacher_name = sc.nextLine();
            teacher.setTeacher(teacher_name);
            teachers[i] = teacher;
        }
        for (int i=0; i<noOfTeacher; i++){
            System.out.println(teachers[i].getTeacher());

        }
        System.out.println("Enter the name of " +noOfSubject+ " Subject");
        for(int j= 0;j<noOfSubject; j++){
            subject = new Subject();
            System.out.println("Enter the name of Subject " +(j+1));
            String subject_name = sc.nextLine();
            System.out.println("Assign the teacher name for this book from below list");
            for(j=0;j<noOfTeacher;j++){
                Subject sb = new Subject();
                //System.out.println((j+1)+":) "+teachers[j].getTeacher());
                //System.out.println(Subject.display());---------------------------
            }
            String name = sc.nextLine();
            Teacher temp = null;
            for(int i=0; i<noOfTeacher;i++){
                if(teachers[i].equals(name)){
                    teacher = new Teacher();
                    temp = teachers[i];
                    break;
                }
            }
            if(temp==null){
                System.out.println(" There is no such teacher, please try again!");
            }
            subject.setSubject(subject_name);
            //subject.setTeacher(temp);
            subjects[j] = subject;
            //subject.setTeacher(subject_name);

        }
        for(int i=0;i<noOfSubject;i++){
            System.out.println(subjects[i].getSubject());
            //System.out.println(subjects[k].getTeacher());
        }

        System.out.println(s.getTeacher());
        System.out.println(s.getProfession());*/
    }
}
