import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

/**
 * Class that will create a bar graph that
 * represents the values of an integer array. Vertical bars
 * will be on bottom, not hanging.
 *
 * @author Ari Camhi
 * @version 2-3-23
 */
public class SortGUI extends JFrame {
    private int[] arr = new int[]{105, 78, 35, 48, 142, 24, 55};

    public SortGUI() {
        super("SortGUI");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        paint(getGraphics());
    }


    /**
     * Actual method for insertion sort, no GUIs
     */
    public void insertionSort() {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    continue;
                }
                break;
            }
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public void paint(Graphics g) {
        //Resets frame to white
        g.setColor(Color.white);
        g.fillRect(0, 0, 1000, 1000);
        for (int i = 0; i < arr.length; i++) {
            //Creating baseline
            g.setColor(Color.red);
            g.drawLine(0, 500, 600, 500);
            //Color randomizer
            float hue = (float) Math.random();
            int rgb = Color.HSBtoRGB(hue, 0.5F, 0.5F);
            Color color = new Color(rgb);
            g.setColor(color);
            //Bar graph creation
            g.fillRect(i * (600 / arr.length), 500 - arr[i], 600 / arr.length, arr[i]);
        }
    }

    public static void main(String[] args) {
        SortGUI sg = new SortGUI();
        sg.insertionSort();
    }

}
