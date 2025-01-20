package sample;

public class Ex14 {
  public static void method1() throws ClassNotFoundException{
    Class.forName("java.lang.NonExistClass");
    System.out.println("クラスが⾒つかりません");
  }
  
  public static void main(String[] args) throws ClassNotFoundException {
  method1();
}
}
