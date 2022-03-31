package ch2;

class Student {
  String name;
  int score;
  static final int MAX_SCORE = 100;

  Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  Student(String name) {
    // 引数が少ないコンストラクタでは`this(...)を使う`
    // Student(String name, int score)を呼び出す書き方
    this(name, 0);
  }

  void printScore() {
    System.out.println(name + " is " + MAX_SCORE + " of " + score + " .");
  }

  void printScore(String name) {
    System.out.println(name + ": " + score);
  }

  void setName(String name) {
    // フィールドと引数が同名の場合thisを使う
    this.name = name;
  }
}

public class second {
  public static void main(String... args) {
    // Student murata = new Student();
    Student murata = new Student("murata");
    murata.score = 80;
    murata.printScore();

    Student okada = new Student("okada", 20);
    okada.printScore();
  }
}
