import javax.swing.*;
import java.awt.*;

public class HangmanGUI extends JFrame {
    Hangman hm = new Hangman();
    int counter = 6;

    /**
     * Lets the swing graphics run at the same time as the scanner
     * by using SwingWorker, admittedly found through some google searches
     * on what this does
     */
    public HangmanGUI() {
        SwingWorker<Void, String> sw = new SwingWorker<>() {
            @Override
            public Void doInBackground() {
                hm.hangmanUI(HangmanGUI.this);
                return null;
            }
        };
        sw.execute();
    }

    public void decrementGuess() {
        --counter;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        //Beginning
        g.setColor(Color.black);
        g.fillRect(50, 50, 5, 300);
        g.fillRect(50, 50, 150, 5);
        g.fillRect(200, 50, 5, 40);
        //Head
        if (counter == 5)
            g.drawOval(180, 90, 50, 50);
        //Body
        if (counter == 4)
            g.fillRect(203, 140, 1, 60);
        //First Leg
        if (counter == 3)
            g.drawLine(203, 200, 243, 230);
        //Second Leg
        if (counter == 2)
            g.drawLine(203, 200, 163, 230);
        //First Arm
        if (counter == 1)
            g.drawLine(203, 175, 243, 155);
        //Second Arm
        if (counter == 0)
            g.drawLine(203, 175, 163, 155);
    }

    public static void main(String[] args) {
        HangmanGUI hmg = new HangmanGUI();
        hmg.setSize(600, 600);
        hmg.setDefaultCloseOperation(EXIT_ON_CLOSE);
        hmg.setVisible(true);
    }
}
