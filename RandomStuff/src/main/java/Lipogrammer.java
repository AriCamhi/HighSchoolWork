import javax.swing.*;

public class Lipogrammer {
    private JTextArea original, marked, words;
    private JButton go;

    // Constructor
    public Lipogrammer() {
    }
    public String getText() {
        return original.getText();
    }
    public void setText(String text) {
        original.setText(text);
    }
}