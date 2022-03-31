package ch12;


public class DataChanger extends Subject {
  private int status;

  @Override
  public void execute() {
    status++;
    System.out.println("status is change to " + status);
    notifyObservers();
  }
}
