package ch2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class first {
  public static void main(String... args) {
    // int second = LocalDateTime.now().getSecond();
    // System.out.println(second);

    // int[] numbers = {1, 3, 4};
    // for (int number : numbers) {
    //   System.out.println(number);
    // }

    Scanner in = new Scanner(System.in);
    System.out.println("please input");
    String str = in.nextLine();
    System.out.println(str + " you input");
  }
}
