package ch4;

import java.util.Arrays;
import java.util.List;

public class first {
  public static void main(String... args) {
    List<String> list = Arrays.asList("x", "y", "z");
    // str -> System.out.println(str)
    list.forEach(System.out::println);
  }
}
