package evencharacters;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();
        }

        FileToArray fileToArray = new FileToArray();
        ArrayList<Integer> list = fileToArray.getArrayFromFile(fileName1);
        FileSorting fileSorting = new FileSorting();
        fileSorting.fileSort(fileName2, list);
    }
}
