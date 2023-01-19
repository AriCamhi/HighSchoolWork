import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class MushroomArrayList {
    String filename = "mushrooms.txt";
    ArrayList<String> mushrooms;
    ArrayList<Mushroom> mushroomsList;

    //Constructor
    public MushroomArrayList() throws IOException {
        mushrooms = new ArrayList<String>();
        mushroomsList = new ArrayList<Mushroom>();
        fillArray();
    }

    /**
     * takes every row from a given file and fills an arraylist with the data
     */
    private void fillArray() throws IOException {
        File input = new File(filename);
        Scanner words = new Scanner(input);
        while (words.hasNextLine()) {
            mushrooms.add(words.nextLine());
        }
        words.close();

        for (int i = 0; i < mushrooms.size(); i++) {
            if (mushrooms.get(i) == "") {
                mushrooms.remove(i);
            }
        }

        for (int i = 0; i < mushrooms.size(); i++) {
            Mushroom m = new Mushroom(mushrooms.get(i));
            mushroomsList.add(m);
        }
    }

    public String getMushroom(int index) {
        return mushrooms.get(index);
    }

    public ArrayList<Mushroom> getMushroomList() {
        return mushroomsList;
    }

}