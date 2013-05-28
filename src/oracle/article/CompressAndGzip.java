package oracle.article;

import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 * @author jon
 */
public class CompressAndGzip {

    public static void main(String[] args) throws Exception {
        FileInputStream input = new FileInputStream(new File("resources/jabberwocky.txt"));
        byte[] buf = new byte[4096];
        int read = 0;

        FileOutputStream  fos = new FileOutputStream("jabber.txt.gz");
        GZIPOutputStream  gos = new GZIPOutputStream(fos);

        while ((read = input.read(buf)) != -1) {
            gos.write(buf, 0, read);
        }

        // Note to self. In first attempt I forgot to close the streams and this meant that the file
        // could not be opened by GZIP until on my Mac. Closing the streams fixed the problem.
        // Should now be able to unzip the file and read the contents
        gos.close();
        input.close();
    }
}
