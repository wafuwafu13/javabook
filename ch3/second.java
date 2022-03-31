package ch3;

interface Foo {
  String say();
}

class DefaultFoo implements Foo {
  public String say() {
    return "say";
  }
}
