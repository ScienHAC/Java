package com.krmu.day_06_sep;

public class Library {
    public Book[] books;
    public Member[] members;
    public int bookCount;
    public int memberCount;

    public Library() {
        books = new Book[100];
        members = new Member[50];
        bookCount = 0;
        memberCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        }
    }

    public void registerMember(Member member) {
        if (memberCount < members.length) {
            members[memberCount] = member;
            memberCount++;
        }
    }

    public Book findBookByISBN(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].ISBN.equals(ISBN)) {
                return books[i];
            }
        }
        return null;
    }

    public Member findMemberById(String memberId) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].memberId.equals(memberId)) {
                return members[i];
            }
        }
        return null;
    }

    public void lendBook(String ISBN, String memberId) {
        Book book = findBookByISBN(ISBN);
        Member member = findMemberById(memberId);
        if (book != null && member != null && book.isAvailable) {
            book.isAvailable = false;
            member.borrowBook(book);
        }
    }

    public void returnBook(String ISBN, String memberId) {
        Book book = findBookByISBN(ISBN);
        Member member = findMemberById(memberId);
        if (book != null && member != null) {
            book.isAvailable = true;
            member.returnBook(book);
        }
    }

    public void displayStatus() {
        System.out.println("Books:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].title + " | " + books[i].ISBN + " | " + (books[i].isAvailable ? "Available" : "Borrowed"));
        }
        System.out.println("Members:");
        for (int i = 0; i < memberCount; i++) {
            System.out.print(members[i].name + " (" + members[i].memberId + ") borrowed books: ");
            for (int j = 0; j < members[i].borrowedCount; j++) {
                System.out.print(members[i].borrowedBooks[j].title + "; ");
            }
            System.out.println();
        }
    }
}
