package ch5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class first {
  public static void main(String... args) {
    List<String> list = Arrays.asList("12345", "12", "123456");
    List<String> newList = list.stream()
      .filter(p -> p.length() > 5)
      .collect(Collectors.toList());
    System.out.println(newList);
  }
}
