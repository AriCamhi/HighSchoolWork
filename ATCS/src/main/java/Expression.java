import java.util.Stack;

/**
 * Class for the Validity Lab
 *
 * @author Ari Camhi
 * @version 1-10-23
 */
public class Expression{
    private String myExpression;
    private String OPENER;
    private String CLOSER;
    public Expression(String expression, String opener, String closer)
    {
        myExpression = expression;
        OPENER = opener;
        CLOSER = closer;
    }
    public boolean validExpression() {
        Stack s = new Stack();
        String[] arr = myExpression.split("(?!^)");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(OPENER) || arr[i].equals(CLOSER)) {
                s.push(arr[i]);
            }
        }
        StringBuilder finalExpression = new StringBuilder();
        int sizie = s.size();
        for(int j = 0; j < sizie; j++){
            finalExpression.append(s.pop());
        }

        System.out.println(finalExpression.reverse());
        return true;
    }

    public static void main(String[] args){
        Expression e = new Expression("(2(x+5)) - (3(7) + 4)", "(", ")");
        e.validExpression();
    }
}
