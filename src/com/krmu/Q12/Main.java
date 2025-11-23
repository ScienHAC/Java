package com.krmu.Q12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// Superclass
class LibraryUser {
    protected int userId;
    protected String name;

    public LibraryUser(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // Method to be overridden
    public int maxBooksAllowed() {
        return 0;
    }

    public String userType() {
        return "User";
    }
}

// Student subclass
class Student extends LibraryUser {

    public Student(int userId, String name) {
        super(userId, name);
    }

    @Override
    public int maxBooksAllowed() {
        return 3; // Students can borrow 3 books
    }

    @Override
    public String userType() {
        return "Student";
    }
}

// Teacher subclass
class Teacher extends LibraryUser {

    public Teacher(int userId, String name) {
        super(userId, name);
    }

    @Override
    public int maxBooksAllowed() {
        return 5; // Teachers can borrow 5 books
    }

    @Override
    public String userType() {
        return "Teacher";
    }
}

// Researcher subclass
class Researcher extends LibraryUser {

    public Researcher(int userId, String name) {
        super(userId, name);
    }

    @Override
    public int maxBooksAllowed() {
        return 8; // Researchers can borrow 8 books
    }

    @Override
    public String userType() {
        return "Researcher";
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Creating a collection of library users (polymorphism)
        ArrayList<LibraryUser> users = new ArrayList<>();
        users.add(new Student(101, "Piyush Sharma"));
        users.add(new Teacher(102, "Dr. Mehta"));
        users.add(new Researcher(103, "Rahul Verma"));

        // Display user borrowing limits
        System.out.println("----- Library User Borrowing Limits -----");
        for (LibraryUser u : users) {
            System.out.println("User ID: " + u.userId);
            System.out.println("Name: " + u.name);
            System.out.println("Type: " + u.userType());
            System.out.println("Max Books Allowed: " + u.maxBooksAllowed());
            System.out.println();
        }

        // Generate report and write to a file
        try {
            FileWriter fw = new FileWriter("LibraryReport.txt");

            fw.write("----- Library Issued Books Report -----\n\n");
            for (LibraryUser u : users) {
                fw.write("User ID: " + u.userId + "\n");
                fw.write("Name: " + u.name + "\n");
                fw.write("Type: " + u.userType() + "\n");
                fw.write("Max Books Allowed: " + u.maxBooksAllowed() + "\n");
                fw.write("--------------------------------------\n");
            }

            fw.close();
            System.out.println("Report successfully written to LibraryReport.txt");

        } catch (IOException e) {
            System.out.println("Error writing report: " + e.getMessage());
        }
    }
}

