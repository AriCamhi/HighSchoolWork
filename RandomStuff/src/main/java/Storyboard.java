import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Lab 05 for ATCS
 *
 * @author Ari Camhi
 * @version 10-11-22
 */
public class Storyboard {
    public static void main(String[] args) {
        //Run the code here
        Storyboard buttons = new Storyboard();
        buttons.start();
    }

    public void start() {
        //Creates the frame
        JFrame frame = new JFrame("Owl Time");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a panel with a layout to place on the frame
        //Attach the panel to the frame
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(2, 2, 15, 0));
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        //Create labels and buttons to place on the panel
        JLabel begin = new JLabel("You wake up...");
        JLabel move = new JLabel("Do you want to brush your teeth?");
        JButton choice1 = new JButton("Yes");
        JButton choice2 = new JButton("No");

        //Attach the labels and buttons to the panel
        panel.add(begin);
        panel.add(move);
        panel.add(choice1);
        panel.add(choice2);

        //Attach the actions listeners to the buttons
        choice1.addActionListener(new Storyboard.Action1());
        choice2.addActionListener(new Storyboard.Action2());
    }

    static class Action1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Yes");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("You now have good breath and get complimented");
            JLabel question = new JLabel("Would you like to fist bump or hug the person?");
            panel.add(label);
            panel.add(question);
            JButton hug = new JButton("Hug");
            JButton fistBump = new JButton("Fist Bump");
            panel.add(hug);
            panel.add(fistBump);
            hug.addActionListener(new Storyboard.Action3());
            fistBump.addActionListener(new Storyboard.Action3());
        }
    }

    static class Action2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("No");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("You have bad breath now and get made fun of");
            panel.add(label);
            JLabel question = new JLabel("Would you like to punch them or pet the person who made fun of you?");
            panel.add(question);
            JButton punch = new JButton("Punch");
            JButton pet = new JButton("Pet");
            panel.add(punch);
            panel.add(pet);
            punch.addActionListener(new Storyboard.Action4());
            pet.addActionListener(new Storyboard.Action3());
        }
    }

    static class Action3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Aliens");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("Alien comes down to earth and rewards you with an owl..." +
                    " do you accept?");
            panel.add(label);
            JButton yes = new JButton("Yes");
            JButton no = new JButton("No");
            panel.add(yes);
            panel.add(no);
            yes.addActionListener(new Storyboard.Action5());
            no.addActionListener(new Storyboard.Action6());
        }
    }

    static class Action4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Aliens");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("Friend gets upset and calls Aliens down to Earth");
            JLabel question = new JLabel("Aliens bring owl and offer it to you, do you accept?");
            panel.add(label);
            panel.add(question);
            JButton yes = new JButton("Yes");
            JButton no = new JButton("No");
            panel.add(yes);
            panel.add(no);
            yes.addActionListener(new Storyboard.Action5());
            no.addActionListener(new Storyboard.Action6());
        }
    }

    static class Action5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Owl Time");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("The owl bites you and you turn into an owl");
            JLabel question = new JLabel("Do you wish to fly away or bite your friend");
            panel.add(label);
            panel.add(question);
            JButton fly = new JButton("Fly Away");
            JButton bite = new JButton("Bite Friend");
            panel.add(fly);
            panel.add(bite);
            fly.addActionListener(new Storyboard.Action7());
            bite.addActionListener(new Storyboard.Action10());
        }
    }

    static class Action6 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Owl Time");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("The owl bites your friend instead because you did not accept... Your friend " +
                    " turns into an owl");
            JLabel question = new JLabel("Do you want to try and help your friend or run away?");
            panel.add(label);
            panel.add(question);
            JButton help = new JButton("Help Friend");
            JButton run = new JButton("Run away");
            panel.add(help);
            panel.add(run);
            help.addActionListener(new Storyboard.Action13());
            run.addActionListener(new Storyboard.Action14());
        }
    }

    static class Action7 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Owl Time");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("Because you are now an owl, you are offered to go to owl school");
            JLabel question = new JLabel("Do you accept?");
            panel.add(label);
            panel.add(question);
            JButton yes = new JButton("Yes");
            JButton no = new JButton("No");
            panel.add(yes);
            panel.add(no);
            yes.addActionListener(new Storyboard.Action8());
            no.addActionListener(new Storyboard.Action9());
        }
    }

    static class Action8 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Owl Time");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("Congratulations, you are now a smart owl!!! THE END");
            panel.add(label);
        }
    }

    static class Action9 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Owl Time");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("Sadly, you are now a dumb owl... THE END");
            panel.add(label);
        }
    }

    static class Action10 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Owl Time");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("You have now gotten the taste for making other people owls...");
            JLabel question = new JLabel("Do you wish to start an army of owls?");
            panel.add(label);
            panel.add(question);
            JButton yes = new JButton("Yes");
            JButton no = new JButton("No");
            panel.add(yes);
            panel.add(no);
            yes.addActionListener(new Storyboard.Action11());
            no.addActionListener(new Storyboard.Action12());
        }
    }

    static class Action11 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Owl Time");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("Congratulations, you have become king of the world as an owl!!! THE END");
            panel.add(label);
        }
    }

    static class Action12 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Owl Time");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("Sadly, you have died a lonely owl because you did not make an army..." +
                    "THE END");
            panel.add(label);
        }
    }

    static class Action13 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Owl Time");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("Although you tried helping your friend, his owl urges cause him" +
                    " to bite you and you become an owl");
            JLabel question = new JLabel("Now do you wish to fly away or bite more people?");
            panel.add(label);
            panel.add(question);
            JButton fly = new JButton("Fly Away");
            JButton bite = new JButton("Bite more people");
            panel.add(fly);
            panel.add(bite);
            fly.addActionListener(new Storyboard.Action7());
            bite.addActionListener(new Storyboard.Action10());
        }
    }

    static class Action14 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Owl Time");
            frame.setVisible(true);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            JLabel label = new JLabel("After you tried to run away your friend bites you and you become an owl");
            JLabel question = new JLabel("Now that you are an owl do you wish to fly away or bite more people?");
            panel.add(label);
            panel.add(question);
            JButton fly = new JButton("Fly Away");
            JButton bite = new JButton("Bite more people");
            panel.add(fly);
            panel.add(bite);
            fly.addActionListener(new Storyboard.Action7());
            bite.addActionListener(new Storyboard.Action10());
        }
    }
}