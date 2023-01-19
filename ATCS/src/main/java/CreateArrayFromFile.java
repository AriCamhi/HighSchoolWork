import java.io.IOException;
import java.io.*;
import java.util.*;

/**
 * Code along in ATCS
 *
 * @author Ari Camhi
 * @version 11-7-22
 */
public class CreateArrayFromFile {
    private final String fileName;
    private final String[] file;

    public CreateArrayFromFile(String fileName) throws IOException {
        this.fileName = fileName;
        file = new String[countLines()];
        fillArray();
    }

    private int countLines() throws IOException {
        int count = 0;
        File input = new File(fileName);
        Scanner words = new Scanner(input);
        while (words.hasNextLine()) {
            String line = words.nextLine();
            count++;
        }
        words.close();
        return count;
    }

    private void fillArray() throws IOException {
        int count = 0;
        File input = new File(fileName);
        Scanner words = new Scanner(input);
        while (words.hasNextLine()) {
            file[count] = words.nextLine();
            count++;
        }
        words.close();
    }

    public String[] getFile() {
        return file;
    }

    public int getSize() {
        return file.length;
    }

    public static void main(String[] args) throws IOException {
        CreateArrayFromFile c = new CreateArrayFromFile("/Users/aricamhi/IdeaProjects/HighSchoolWork/ATCS/src/main/java/testfile.txt");
        c.countLines();
        c.fillArray();
        System.out.println(Arrays.toString(c.getFile()));
    }
}
