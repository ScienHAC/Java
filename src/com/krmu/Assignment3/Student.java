package com.krmu.Assignment3;

class Student {
    int rollNumber;
    String studentName;
    int[] marks;

    public Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    public void validateMarks() throws InvalidMarksException {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarksException("Marks must be between 0 and 100. Invalid: " + mark);
            }
        }
    }

    public double calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / 3.0;
    }

    public void displayResult() {
        System.out.println("\nStudent Result");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + studentName);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        double avg = calculateAverage();
        System.out.println("Average: " + avg);
        System.out.println("Status: " + (avg >= 40 ? "PASS" : "FAIL"));
    }
}

