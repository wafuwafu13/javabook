package ch3;

class Sample {
  private int primitive;
  private Integer wrapper;

  @Override
  public String toString() {
    return "primitive:" + primitive + ", wrapper:" + wrapper;
  }
}

public class first {
  public static void main(String... args) {
    byte num = 2;
    short shortNum = 100;
    // ワイドニングにより (short -> int)
    int intNum = shortNum;
    
    int iN = 1;
    // Type mismatch: cannot convert from int to short
    // 小は大を兼ねない
    // short sN = intNum;
  
    // intの上限+1
    int in = 32767 + 1;
    // ナローイングによりキャスト
    // shortの範囲を超えて -32768 となる
    short sn = (short) intNum;
    
    System.out.println(Byte.MAX_VALUE); // 2147483647

    Sample sample = new Sample();
    // nullチェックができるようにプリミティブ型を内包し、そのプリミティブ型の値を操作する機能を備えたラッパークラスを用いることがある
    System.out.println(sample);
  }
}
