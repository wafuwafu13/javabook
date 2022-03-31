package ch9;

import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;

public class first {
  public static void main(String... args) {
    JapaneseDate date = JapaneseDate.of(JapaneseEra.HEISEI, 29, 2, 4);
    System.out.println(date);
  }
}
