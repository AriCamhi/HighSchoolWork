package LibraryLab;

/**
 * Parent class for the Library Lab. Holds the common
 * attributes such as Title, author,, and Publication Date.
 *
 * @author Ari Camhi
 * @version 3-29-23
 */
public class Item {
    private String title;
    private String author;
    private String publicationDate;

    private static int nextTitleID = 0;

    protected static int getNextTitleID() {
        return ++nextTitleID;
    }

    private static int nextAuthor = 0;

    protected static int getNextAuthor() {
        return ++nextAuthor;
    }

    /**
     * Empty Constructor
     */
    public Item() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

}
