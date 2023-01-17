/**
 * Interface that will be implemented in the Expression
 * Class
 *
 * @author Ari Camhi
 * @version 1-10-23
 */
public interface Validity {
    boolean isValidFile();
    void printFile();
    String getOpening();
    String getClosing();
}
