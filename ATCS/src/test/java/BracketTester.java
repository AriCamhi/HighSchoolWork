import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Will test all methods of ValidBracket Class...
 *
 * @author Ari Camhi
 * @version 1-10-23
 */
public class BracketTester {

    Expression e = new Expression("2x(5 + 9) + (3)", "(", ")");

    @Test
    public void testingValidExpression() {
        assert (e.validExpression());
    }

    @Test
    public void testingValidBracket1() throws IOException {
        String file = "C:\\Users\\arijc\\IdeaProjects\\HighSchoolWork\\ATCS\\src\\main\\resources\\BracketTesting1.txt";
        Path p = Paths.get(file);
        ValidBracket vb = new ValidBracket(p, "(", ")");
        assert (!vb.isValidFile());
    }

    @Test
    public void testingValidBracket2() throws IOException {
        String file = "C:\\Users\\arijc\\IdeaProjects\\HighSchoolWork\\ATCS\\src\\main\\resources\\BracketTesting2.txt";
        Path p = Paths.get(file);
        ValidBracket vb = new ValidBracket(p, "(", ")");
        assert (vb.isValidFile());
    }

    @Test
    public void testingValidBracket3() throws IOException {
        String file = "C:\\Users\\arijc\\IdeaProjects\\HighSchoolWork\\ATCS\\src\\main\\resources\\BracketTesting3.txt";
        Path p = Paths.get(file);
        ValidBracket vb = new ValidBracket(p, "(", ")");
        assert (!vb.isValidFile());
    }

}
