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
    // ���������Ȃ��R���X�g���N�^�ł�`this(...)���g��`
    // Student(String name, int score)���Ăяo��������
    this(name, 0);
  }

  void printScore() {
    System.out.println(name + " is " + MAX_SCORE + " of " + score + " .");
  }

  void printScore(String name) {
    System.out.println(name + ": " + score);
  }

  void setName(String name) {
    // �t�B�[���h�ƈ����������̏ꍇthis���g��
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
