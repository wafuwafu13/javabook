package ch11;

public class Increment {
  public static void main(String... args) {
    IntHolder holder = new IntHolder();
    Thread th1 = new Thread(new IntIncrementer("thread-1", holder));
    Thread th2 = new Thread(new IntIncrementer("thread-2", holder));
    th1.start();
    th2.start();

    try {
      th1.join();
      th2.join();
      int result = holder.getResult();
      System.out.println("result: " + result);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
