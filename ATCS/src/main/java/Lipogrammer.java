import javax.swing.*;

/**
 * Lab 4 for ATCS
 *
 * @author Ari Camhi
 * @version 10-6-22
 */
public class Lipogrammer {
    private JTextArea original;

    // Empty constructor
    public Lipogrammer() {

    }

    public String getText() {
        return original.getText();
    }

    public void setText(String text) {
        original.setText(text);
    }

}