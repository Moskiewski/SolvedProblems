package punctuations;

import java.io.*;
import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) throws IOException {
        String inputFileName;
        String outputFileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFileName = reader.readLine();
            outputFileName = reader.readLine();
        }

        FileToArrayList fileToArrayList = new FileToArrayList();
        ArrayList<String> fileContent = fileToArrayList.getArrayListFromAFile(inputFileName);
        PunctuationReplace punctuationReplace = new PunctuationReplace();
        punctuationReplace.replacingPunctuationAndNewLineSymbol(outputFileName, fileContent);
    }
}


