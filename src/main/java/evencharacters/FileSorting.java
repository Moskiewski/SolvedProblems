package evencharacters;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileSorting {
    void fileSort(String fileName2, ArrayList<Integer> list) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName2)) {
            for (int i = 1; i < list.size(); i = i + 2) {
                fileWriter.write((byte) (int) list.get(i));
            }
        }
    }
}
