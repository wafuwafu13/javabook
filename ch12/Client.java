package ch12;

public class Client implements Observer {
  @Override
  public void update(Subject subject) {
    System.out.println("subject notification");
  }
}
