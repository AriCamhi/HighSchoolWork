import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Code along in ATCS
 *
 * @author Ari Camhi
 * @version 10-6-22
 */
public class PatientZero {
    public static void main(String[] args) {
        PatientZero buttons = new PatientZero();
        buttons.go();
    }

    public void go() {
        //Creates the frame
        JFrame frame = new JFrame("A day in the life.");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a panel with a layout to place on the frame
        //Attach the panel to the frame
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(2, 2, 15, 0));
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        //Create labels and buttons to place on the panel
        JLabel begin = new JLabel("Wake up, it's time to get UP");
        JLabel move = new JLabel("What would you like to do?");
        JButton choice1 = new JButton("Get dressed and get everyone sick");
        JButton choice2 = new JButton("Go back to bed");

        //Attach the labels and buttons to the panel
        panel.add(begin);
        panel.add(move);
        panel.add(choice1);
        panel.add(choice2);

        //Attach the actions listeners to the buttons
        choice1.addActionListener(new Action1());
        choice2.addActionListener(new Action2());
    }

    static class Action1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Choice 1");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("Yay... you chose choice 1");
            panel.add(label);
        }
    }

    static class Action2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Choice 2");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("Yay... you chose choice 2");
            panel.add(label);
        }
    }
}
