package com.krmu.firstDay;
import java.util.Scanner;

class Student{ // by default, it is package-private if no public is use
    private int Rno;
    private double marks;
    private String name, course;
    private char Grade;

    Scanner sc = new Scanner(System.in);

    void setRno(int rno){
        this.Rno = rno;
    }
    void setMarks(double m){
        this.marks = m;
    }
    void setName(String n){
        this.name = n;
    }
    void setCourse(String c){
        this.course = c;
    }
    private void setGrade(){
        if(marks >= 90){
            Grade = 'A';
        } else if(marks >= 80){
            Grade = 'B';
        } else if(marks >= 70){
            Grade = 'C';
        } else if(marks >= 60){
            Grade = 'D';
        } else {
            Grade = 'F';
        }
    }

    Student(int rno, String n, double m, String c){
        setRno(rno);
        setName(n);
        setMarks(m);
        setCourse(c);
    }
    Student(){
//        default constructor
    }
    void setDetails(){
        System.out.print("Enter Roll No: ");
        setRno(sc.nextInt());
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        setName(sc.nextLine());
        System.out.print("Enter Marks: ");
        setMarks(sc.nextDouble());
        sc.nextLine(); // consume newline
        System.out.print("Enter Course: ");
        setCourse(sc.nextLine());
    }

    void Display(){
        setGrade(); // setting grade based on marks
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + Rno);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + Grade);
        for(int i = 0;i<20;i++) System.out.print("-");
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setRno(101);
        s1.setName("Alice");
        s1.setCourse("Computer Science");
        s1.Display();

        Student s2 = new Student();
        s2.setRno(102);
        s2.setName("Bob");
        s2.setMarks(92.0);
        s2.setCourse("Mathematics");
        s2.Display();

        Student s3 = new Student();
        s3.setRno(103);
        s3.setName("Charlie");
        s3.setMarks(75.0);
        s3.setCourse("Physics");
        s3.Display();

        Student s4 = new Student();
        s4.setDetails();
        s4.Display();
   }
}

