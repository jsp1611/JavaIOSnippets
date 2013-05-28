package io.book;

import java.io.InputStream;

/**
 * @author jon poulton
 */
public class SystemInWithEOS {

    public static void main(String[] args) throws Exception {
        InputStream in = System.in;

        int var;
        do {
            var = in.read();
            System.out.print((char)var);
        } while (var != -1);

        // Does not seem to recognise Cntrl-D or Cntrl-Z as end of stream
    }
}
