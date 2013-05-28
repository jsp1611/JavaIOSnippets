package oracle.article;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;

/**
 * Opens a file and reads it using a Reader. Reader and Writers
 * are used for character based IO (2 bytes per char) whereas
 * Streams are byte-oriented.
 *
 * @author jon
 */
public class OpensFile {

    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader(new File("resources/jabberwocky.txt"));
        PrintWriter writer = new PrintWriter(System.out);
        char[] buf = new char[4096];
        int read = 0;

        // Reads a number of characters into buf and returns the number read. -1 if end of stream
        while((read = reader.read(buf)) != -1) {
            // Writes "read" number of characters starting from offset 0 from the buffer buf
            writer.write(buf, 0, read);
        }

        writer.close();
        reader.close();
    }
}
