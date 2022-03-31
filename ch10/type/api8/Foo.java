package ch10.type.api8;

public interface Foo {
  String say();

  static Foo newInstance(String message) {
    return new DefaultFoo(message);
  }
}
