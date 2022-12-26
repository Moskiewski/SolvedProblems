package spaces;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        FileInputStream input = new FileInputStream(file);
        int ch;
        int charCount;
        int spaceCount = 0;
        for (charCount = 0; (ch = input.read()) != -1; charCount++) {
            if (Character.isWhitespace((char) ch))
                spaceCount++;
        }
        input.close();
        double score = (spaceCount / (double) charCount) * 100;
        double roundOff = Math.round(score * 100.0) / 100.0d;
        System.out.println(roundOff);
    }
}
