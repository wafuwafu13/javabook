package ch8;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class second {
  public static void main(String... args) {
    Path path = Paths.get("./tmp/sample.dat");
    byte[] data = new byte[]{0x41, 0x42, 0x43};

    try {
      Files.write(path, data, StandardOpenOption.APPEND,
        StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    } catch (IOException ex) {
      System.out.println(ex);
    }

    try (InputStream is = Files.newInputStream(path)) {
      for (int ch; (ch = is.read()) != -1; ) {
        System.out.print((char) ch);
      }
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
