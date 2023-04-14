package LibraryLab;

import java.util.Random;

/**
 * Subclass for Library Lab.
 *
 * @author Ari Camhi
 * @version 3-29-23
 */
public class Magazine extends Item {
    private static int issueNumber = 0;

    private static int getNextIssueNumber() {
        return ++issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Magazine() {
        Random r = new Random();
        setTitle("Magazine " + getNextTitleID());
        setAuthor("Author" + getNextAuthor());
        setPublicationDate((1 + r.nextInt(12)) + "/" + (1 + r.nextInt(28)) +
                "/" + (1975 + r.nextInt(47)));
        setIssueNumber(getNextIssueNumber());
    }

    public String toString() {
        return "Item{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", publicationDate='" + getPublicationDate() + '\'' +
                ", issueNumber='" + getIssueNumber() + '\'' +
                '}';
    }
}
