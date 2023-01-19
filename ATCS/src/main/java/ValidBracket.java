import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Class that can take in any file and determine
 * if the file has valid brackets. Should use Expression
 * Class
 *
 * @author Ari Camhi
 * @version 1-10-23
 */
public class ValidBracket implements Validity{
    private Path p;
    private String opener;
    private String closer;
    public ValidBracket(Path p, String opener, String closer){
        this.p = p;
        this.opener = opener;
        this.closer = closer;
    }

    @Override
    public boolean isValidFile() throws IOException {
        String contents = Files.readString(p);
        Expression e = new Expression(contents,getOpening(),getClosing());
        return e.validExpression();
    }

    @Override
    public void printFile() throws IOException {
        String contents = Files.readString(p);
        System.out.println(contents);
    }

    @Override
    public String getOpening() {
        return opener;
    }

    @Override
    public String getClosing() {
        return closer;
    }
}
