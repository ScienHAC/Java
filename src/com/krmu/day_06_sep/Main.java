package com.krmu.day_06_sep;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Programming", "James Gosling", "ISBN001");
        Book b2 = new Book("Effective Java", "Joshua Bloch", "ISBN002");
        lib.addBook(b1);
        lib.addBook(b2);

        Member m1 = new Member("Alice", "MEM1");
        Member m2 = new Member("Bob", "MEM2");
        lib.registerMember(m1);
        lib.registerMember(m2);

        lib.lendBook("ISBN001", "MEM1");
        lib.returnBook("ISBN001", "MEM1");

        lib.displayStatus();
    }
}
