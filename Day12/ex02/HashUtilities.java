package ex02;

public class HashUtilities {

  public int shortHash(int input) {
    return Math.abs(input % 1000);
  }
}
