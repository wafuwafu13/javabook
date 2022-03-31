package ch10.type.api8;

class DefaultFoo implements Foo {
  private String message;

  DefaultFoo(String message) {
    this.message = message;
  }

  @Override
  public String say() {
    return this.message;
  }
}
