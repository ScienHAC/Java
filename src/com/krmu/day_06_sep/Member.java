package com.krmu.day_06_sep;

public class Member {
    public String name;
    public String memberId;
    public Book[] borrowedBooks;
    public int borrowedCount;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        borrowedBooks = new Book[9]; // max 10 books
        borrowedCount = 0;
    }

    public void borrowBook(Book book) {
        if (borrowedCount < borrowedBooks.length) {
            borrowedBooks[borrowedCount] = book;
            borrowedCount++;
        }
    }

    public void returnBook(Book book) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i] == book) {
                borrowedBooks[i] = borrowedBooks[borrowedCount - 1];
                borrowedBooks[borrowedCount - 1] = null;
                borrowedCount--;
                break;
            }
        }
    }
}
