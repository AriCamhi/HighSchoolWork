/**
 * Class that can take in any file and determine
 * if the file has valid brackets. Should use Expression
 * Class
 *
 * @author Ari Camhi
 * @version 1-10-23
 */
public class ValidBracket implements Validity{
    @Override
    public boolean isValidFile() {
        return false;
    }

    @Override
    public void printFile() {
        System.out.println();
    }

    @Override
    public String getOpening() {
        return null;
    }

    @Override
    public String getClosing() {
        return null;
    }
}
