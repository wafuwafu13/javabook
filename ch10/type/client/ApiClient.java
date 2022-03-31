package ch10.type.client;

import ch10.type.api8.Foo; // DefaultFoo‚Ìimport‚ª•s—v

public class ApiClient {
  public static void main(String... args) {
    Foo foo = Foo.newInstance("Hello Foo");
    System.out.println(foo.say());
  }
}
