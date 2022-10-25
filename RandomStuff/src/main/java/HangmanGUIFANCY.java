import javax.swing.*;
import java.awt.*;


 class HangmanPanel extends JPanel {
    @Override
     public void paintComponent(Graphics g) {
        //Beginning
        g.setColor(Color.black);
        g.fillRect(50,50,5,300);
        g.fillRect(50,50,150,5);
        g.fillRect(200,50,5,40);
        //Head
        g.drawOval(180,90,50,50);
        //Body
        g.fillRect(203,140,1,60);
        //First leg
        //g.drawDiagonalLine()
    }

    @Override
     public Dimension getPreferredSize() {
        return getSize();
    }
}
/**
 * @author Ari Camhi
 * @version 10-3-22
 */
public class HangmanGUIFANCY extends JFrame {

     Hangman hm = new Hangman();
     String enteredText;
     JTextField tf = new JTextField(20);

     JTextField guessTf = new JTextField(5);

     JButton btn = new JButton("Enter Word");
     JButton guessBtn = new JButton("Enter Guess");
    public static void main(String [] args){
        HangmanGUI hg = new HangmanGUI();
    }
    public HangmanGUIFANCY() {
        super("Hangman");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new HangmanPanel(), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        c.add(bottomPanel, BorderLayout.SOUTH);

        btn.addActionListener(e -> textEntered());

        //tf.setPreferredSize(tf.getSize());
        bottomPanel.add(btn);
        bottomPanel.add(tf);

        guessBtn.addActionListener(e -> guessEntered());
        bottomPanel.add(guessBtn);
        bottomPanel.add(guessTf);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //pack();

        //hm.hangmanUI();

    }

    private void guessEntered() {
        String enteredGuess = guessTf.getText();
        guessTf.setText("");
        System.out.println(enteredGuess);
    }

    private void textEntered() {
        enteredText = tf.getText();
        tf.setText("");
        System.out.println(enteredText);
        btn.setEnabled(false);
        tf.setEnabled(false);
    }



}