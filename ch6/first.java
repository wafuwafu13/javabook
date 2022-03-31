package ch6;

public class first {
  public static void main(String... args) {
    String strValue = "abc";
    try {
      int intValue = Integer.valueOf(strValue);
    } catch (NumberFormatException ex) {
      System.out.println(ex);
    }
  }
}
