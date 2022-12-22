package replacingsystemin;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Lena").append('\n');
        sb.append("Olya").append('\n');
        sb.append("Anya").append('\n');
        String data = sb.toString();

        InputStream is = new ByteArrayInputStream(data.getBytes());

        System.setIn(is);

        readAndPrint();
    }

    private static void readAndPrint() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
        reader.close();
        isr.close();
    }
}
