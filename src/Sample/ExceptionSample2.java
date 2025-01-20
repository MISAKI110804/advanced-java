package sample;

public class ExceptionSample2 {
public static void main(String[] args) {
  System.out.println("プログラム開始");
//try catch(Exception e) の処理が多い
//finally のあとは後処理が必要な場合
  try {
    Class.forName("java.lang.NotExistClass");
  } catch (Exception e) {
    e.printStackTrace();
    System.out.println("例外が起きました");
  }finally{
    //後処理
  }
  System.out.println("プログラム終了");
}
}
