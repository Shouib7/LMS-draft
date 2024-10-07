package LMS.Member_Management;

import LMS.Library.Library;

import java.util.ArrayList;

public class Member {

   private final int memberId;
   private   String name;
   private   String email;
   private   String phoneNumber;
   private   ArrayList<String> borrowedBooks;

    public Member(int memberId, String name, String email, String phoneNumber, ArrayList<String> borrowedBooks) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = borrowedBooks;
    }

    public int getMemberId() {
        return memberId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
