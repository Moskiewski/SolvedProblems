package punctuationmarks;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFileName;
        String outputFileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFileName = reader.readLine();
            outputFileName = reader.readLine();
        }

        ArrayList<String> fileContent = getArrayListFromInputFile(inputFileName);
        replacePunctuation(outputFileName, fileContent);
    }

    private static ArrayList<String> getArrayListFromInputFile(String inputFileName) throws IOException {
        ArrayList<String> fileContent = new ArrayList<>();
        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFileName))) {
            while (inputFileReader.ready()) {
                fileContent.add(inputFileReader.readLine());
            }
        }
        return fileContent;
    }

    private static void replacePunctuation(String outputFileName, ArrayList<String> fileContent) throws IOException {
        try (BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String s : fileContent) {
                outputFileWriter.write(s.replaceAll("\\.", "!"));
            }
        }
    }
}