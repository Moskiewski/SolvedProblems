package extendingoutputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileInputStream implements AmigoOutputStream {

    private final AmigoOutputStream amigoOutputStream;
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public QuestionFileInputStream(AmigoOutputStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Do you really want to close the stream? Y/N");
        if (bufferedReader.readLine().equals("Y")) amigoOutputStream.close();
    }
}


