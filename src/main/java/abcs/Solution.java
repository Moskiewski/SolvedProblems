package abcs;

import java.io.FileInputStream;

public class Solution {

    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        FileInputStream input = new FileInputStream(fileName);
        int i = 0;
        int letter;
        while (input.available() > 0) {
            letter = input.read();
            if ((letter > 64 && letter < 91) || (letter > 96 && letter < 123)) {
                i++;
            }
        }
        input.close();
        System.out.println(i);
    }
}

