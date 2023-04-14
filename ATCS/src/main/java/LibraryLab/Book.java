package LibraryLab;

import java.util.Random;

/**
 * Subclass for the Library Lab.
 *
 * @author Ari Camhi
 * @version 3-29-23
 */
public class Book extends Item {
    private String ISBN;

    /**
     * Constructor to generate random Book. No parameters.
     */
    public Book() {
        Random r = new Random();
        setTitle("Book" + getNextTitleID());
        setAuthor("Author" + getNextAuthor());
        setPublicationDate((1 + r.nextInt(12)) + "/" + (1 + r.nextInt(28)) +
                "/" + (1975 + r.nextInt(47)));
        setISBN(100 + r.nextInt(898) + "-" + r.nextInt(10) + "-" + (10 + r.nextInt(10))
                + "-" + (100000 + r.nextInt(899999)) + "-" + r.nextInt(10));
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book: " + getTitle() + ", Author: " + getAuthor() +
                ", Publication Date: " + getPublicationDate() + ", ISBN: " +
                getISBN();
    }


    public static void main(String[] args) {
        Book b = new Book();
        Item i = new Book();
        System.out.println(i.toString());
    }
}
