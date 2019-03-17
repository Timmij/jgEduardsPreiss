package lv.homework5;

import java.util.Objects;

public class Book {

    private String author;
    private String title;
    private int pageCount;

    Book(String title, String author, int pageCount) {

        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(this.author, book.author) && this.pageCount == book.pageCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, pageCount);
    }

    @Override
    public String toString() {
        return "Book :  {title  " + title
                + ", author: " + author
                + ", has " + pageCount + "}";
    }


}

