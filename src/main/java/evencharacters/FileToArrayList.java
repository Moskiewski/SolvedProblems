package evencharacters;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayList {

    public ArrayList<Integer> getArrayFromFile(String fileName1) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader(fileName1)) {
            while (fileReader.ready()) {
                list.add(fileReader.read());
            }
        }
        return list;
    }
}
