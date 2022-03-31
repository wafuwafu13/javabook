package ch8;

import java.io.File;

public class first {
  public static void main(String... args) {
    File dir = new File("./ch2");
    for (String file : dir.list()) {
      System.out.println(file);
    }
  }
}
