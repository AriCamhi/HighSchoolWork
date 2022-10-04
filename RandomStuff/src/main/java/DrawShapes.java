import javax.swing.*;
import java.awt.*;

/**
 * @author Ari Camhi
 * @version 10-3-22
 */
public class DrawShapes extends JFrame {
    public static void main(String [] args){
        DrawShapes face = new DrawShapes();
    }
    public DrawShapes() {
        super("Here are the tests");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        paint(getGraphics());
    }
    public void paint (Graphics g){
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