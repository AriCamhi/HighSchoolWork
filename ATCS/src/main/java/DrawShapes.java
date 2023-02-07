import javax.swing.*;
import java.awt.*;

/**
 * @author Ari Camhi
 * @version 10-3-22
 */
public class DrawShapes extends JFrame {
    public static void main(String[] args) {
        DrawShapes face = new DrawShapes();
    }

    public DrawShapes() {
        super("Here are the tests");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        paint(getGraphics());
    }

    public void paint(Graphics g) {
        //Beginning
        g.setColor(Color.black);
        g.fillRect(50, 50, 5, 300);
        g.fillRect(50, 50, 150, 5);
        g.fillRect(200, 50, 5, 40);
        //Head
        g.drawOval(180, 90, 50, 50);
        //Body
        g.fillRect(203, 140, 1, 60);
        //First leg
        g.drawLine(203, 200, 243, 230);
        //Second Leg
        g.drawLine(203, 200, 163, 230);
        //First Arm
        g.drawLine(203, 175, 243, 155);
        //Second Arm
        g.drawLine(203, 175, 163, 155);
        JLabel label = new JLabel("hello");
        label.setLocation(50,50);
        label.setVisible(true);
        super.add(label);
    }
}