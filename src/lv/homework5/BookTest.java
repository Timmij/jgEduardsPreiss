package lv.homework5;

//Ok
public class BookTest {

    public static void main(String[] args) {

        testBookToString();
        testBookEquals();
    }

    private static void testBookToString() {
        Book book = new Book("Velnini", "Rudolfs Blaumanis", 60);

        String expected = "Book : { title Velnini, author: Rudolfs Blaumanis, has 60 }";

        System.out.println("ToString Test");
        if (expected.equals(book.toString())) {
            System.out.println("ToString Test PASSED");
        } else {
            System.out.println("To String Test FAILED");
            System.out.println("Expected:" + expected);
            System.out.println("Actual" + book);
        }

        System.out.println(book);
    }


    private static void testBookEquals() {
        Book book1 = new Book("Naves Ena", "Rudolfs Blaumanis", 60);
        Book book2 = new Book("Velnini", "Rudolfs Blaumanis", 60);
        boolean expectedEquals = true;

        System.out.println("Objects equals true Test");
        boolean actual = book1.equals(book2);
        if (actual) {
            System.out.println("PASSED");
        } else {
            System.out.println("To equals Test FAILED");
            System.out.println("Expected:" + expectedEquals);
            System.out.println("Actual " + actual);
        }

    }
}
