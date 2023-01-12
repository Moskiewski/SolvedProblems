package punctuations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PunctuationReplace {

    public void replacingPunctuationAndNewLineSymbol(String outputFileName, ArrayList<String> fileContent) throws IOException {
        try (BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String s : fileContent) {
                outputFileWriter.write(s.replaceAll("\\p{P}", ""));
            }
        }
    }
}


