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
    // ���C�h�j���O�ɂ�� (short -> int)
    int intNum = shortNum;
    
    int iN = 1;
    // Type mismatch: cannot convert from int to short
    // ���͑�����˂Ȃ�
    // short sN = intNum;
  
    // int�̏��+1
    int in = 32767 + 1;
    // �i���[�C���O�ɂ��L���X�g
    // short�͈̔͂𒴂��� -32768 �ƂȂ�
    short sn = (short) intNum;
    
    System.out.println(Byte.MAX_VALUE); // 2147483647

    Sample sample = new Sample();
    // null�`�F�b�N���ł���悤�Ƀv���~�e�B�u�^�����A���̃v���~�e�B�u�^�̒l�𑀍삷��@�\����������b�p�[�N���X��p���邱�Ƃ�����
    System.out.println(sample);
  }
}
