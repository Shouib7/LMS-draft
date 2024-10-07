package LMS;
import LMS.Book_Management.Book;
import LMS.Member_Management.Member;
import LMS.Library.Library;

public class Librarian {

    public static void main(String[] args) {

        Book obj = new Book(1111,"Asdf", "Aaaa", "JIKK",121,true);

        System.out.println( obj.toString());
    }
}
