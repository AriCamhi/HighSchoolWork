import java.util.Stack;

/**
 * Class for the Validity Lab
 *
 * @author Ari Camhi
 * @version 1-10-23
 */
public class Expression {
    private final String myExpression;
    private final String OPENER;
    private final String CLOSER;
    public Expression(String expression, String opener, String closer) {
        myExpression = expression;
        OPENER = opener;
        CLOSER = closer;
    }
    public boolean validExpression() {
        Stack <Object> s = new Stack<>();
        String[] arr = myExpression.split("(?!^)");
        for (String value : arr) {
            if (value.equals(OPENER)) {
                s.push(value);
            } else if (value.equals(CLOSER)) {
                if(!s.isEmpty())
                    s.pop();
                else
                    return false;
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Expression e = new Expression("3/(a+(b+2))", "(", ")");
        e.validExpression();
    }
}
