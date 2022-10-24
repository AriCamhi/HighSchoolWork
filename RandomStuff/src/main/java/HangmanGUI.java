import javax.swing.*;
import java.awt.*;

/**
 * Class for a GUI representation of hangman game
 *
 * @author Ari Camhi
 * @version 10-21-22
 */
public class HangmanGUI extends JFrame{

    public static void main(String [] args){
        HangmanGUI hang = new HangmanGUI();
    }

    public HangmanGUI() {
        super("Hangman:");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hangmanDrawing(getGraphics());
    }

    public void hangmanDrawing(Graphics g){
        g.setColor(Color.green);
        g.fillRect(50,50,300,300);
        g.setColor(Color.cyan);
        g.fillOval(75,75,50,50);
        g.fillOval(275,75,50,50);
        g.setColor(Color.white);
        g.fillOval(100,95,15,15);
        g.fillOval(300,95,15,15);
        g.setColor(Color.red);
        g.drawArc(75,190,250,140,180,180);
    }
}
