package LibraryLab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Scanner class to simulate a library system that holds
 * an arraylist of books and magazines. Can return books/magazines
 * and also check out books/magazines.
 *
 * @author Ari Camhi
 * @version 3-29-23
 */
public class Library {
    private final ArrayList<Item> booksAndMags = new ArrayList<>();

    public static void main(String[] args) {
        Library l = new Library();
        l.libraryUI();
    }

    @Override
    public String toString() {
        return "Library{" +
                "booksAndMags=" + booksAndMags +
                '}';
    }

    public void libraryUI() {
        Scanner sc = new Scanner(System.in);
        boolean logOut = false;
        Book b = new Book();
        Magazine m = new Magazine();
        booksAndMags.add(b);
        booksAndMags.add(m);
        while (!logOut) {
            System.out.println("Welcome to the Library! You can search for books/magazines via" +
                    " author(a), title(t), or publication date (pd).\nYou can also checkout(co) a book/magazine" +
                    ", return(r) a book/magazine or print(p) out the inventory of the library");
            String initialChoice = sc.next();
            if (initialChoice.equalsIgnoreCase("a")) {
                System.out.println("Here is the current library: \n" + booksAndMags.toString() + "\nBut keep in" +
                        " mind the library grows larger as you add books and magazines");
                System.out.println("\nType in the author name you would like to search for: ");
                String authorChoice = sc.next();
                int tempIndex = 0;
                for (int i = 0; i < booksAndMags.size(); i++) {
                    if (booksAndMags.get(i).getAuthor().equalsIgnoreCase(authorChoice)) {
                        tempIndex = i;
                    }
                }
                System.out.println(booksAndMags.get(tempIndex).toString());
                System.out.println("Would you like to continue making changes? (yes/no)");
                if (sc.next().equalsIgnoreCase("no")) {
                    logOut = true;
                    sc.close();
                }
            } else if (initialChoice.equalsIgnoreCase("t")) {
                System.out.println("Here is the current library: " + booksAndMags.toString() + "\n But keep in" +
                        " mind the library grows larger as you add books and magazines");
                System.out.println("\nType in the title you would like to search for: ");
                String titleChoice = sc.next();
                for (int i = 0; i < booksAndMags.size(); i++) {
                    if (booksAndMags.get(i).getTitle().equalsIgnoreCase(titleChoice)) {
                        System.out.println(booksAndMags.get(i).toString());
                    }
                }
                System.out.println("Would you like to continue making changes? (yes/no)");
                if (sc.next().equalsIgnoreCase("no")) {
                    logOut = true;
                    sc.close();
                }
            } else if (initialChoice.equalsIgnoreCase("pd")) {
                System.out.println("Here is the current library: " + booksAndMags.toString() + "\n But keep in" +
                        " mind the library grows larger as you add books and magazines");
                System.out.println("\nType in the publication date you would like to search for: ");
                String publicationChoice = sc.next();
                for (int i = 0; i < booksAndMags.size(); i++) {
                    if (booksAndMags.get(i).getPublicationDate().equalsIgnoreCase(publicationChoice)) {
                        System.out.println(booksAndMags.get(i).toString());
                    }
                }
                System.out.println("Would you like to continue making changes? (yes/no)");
                if (sc.next().equalsIgnoreCase("no")) {
                    logOut = true;
                    sc.close();
                }
            } else if (initialChoice.equalsIgnoreCase("co")) {
                System.out.println("Which book would you like to check out? (Type in the title)");
                for (int i = 0; i < booksAndMags.size(); i++) {
                    if (sc.next().equalsIgnoreCase(booksAndMags.get(i).getTitle())) {
                        Item temp = booksAndMags.get(i);
                        System.out.println("Here is the item you checked out: " + temp.toString());
                        booksAndMags.remove(temp);
                    }
                }
                System.out.println("Would you like to continue making changes? (yes/no)");
                if (sc.next().equalsIgnoreCase("no")) {
                    logOut = true;
                    sc.close();
                }
            } else if (initialChoice.equalsIgnoreCase("r")) {
                System.out.println("Are you returning a book or magazine? (b/m)");
                String bookOrMag = sc.next();
                System.out.println("Thank you for returning your Item! We have already added" +
                        " it into our system.");
                if (bookOrMag.equalsIgnoreCase("b")) {
                    Book b1 = new Book();
                    booksAndMags.add(b1);
                    System.out.println("Would you like to continue making changes? (yes/no)");
                    if (sc.next().equalsIgnoreCase("no")) {
                        logOut = true;
                        sc.close();
                    }
                } else {
                    Magazine m1 = new Magazine();
                    booksAndMags.add(m1);
                    System.out.println("Would you like to continue making changes? (yes/no)");
                    if (sc.next().equalsIgnoreCase("no")) {
                        logOut = true;
                        sc.close();
                    }
                }
            } else if (initialChoice.equalsIgnoreCase("p")) {
                System.out.println("Here is the library inventory: " + booksAndMags.toString());
                System.out.println("\nWould you like to continue making changes? (yes/no)");
                if (sc.next().equalsIgnoreCase("no")) {
                    logOut = true;
                    sc.close();
                }
            } else if (initialChoice.equalsIgnoreCase("lv")) {
                logOut = true;
                sc.close();
            }
        }
    }
}
