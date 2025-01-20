package sample;

public interface ExceptionSample4 {
public static void main(String[] args) {
  System.out.println("プログラム開始");
  try {
    method1();
  } catch (ClassNotFoundException e) {
    //元々のエラーの位置は違ったが、そのエラーをクイックフィックスすると、呼び出しもとに移動
    e.printStackTrace();
    System.out.println("例外発生");
  }
  System.out.println("プログラム終了");
}
public static void method1() throws ClassNotFoundException{
Class.forName("java.lang.NotExistClass");
//エラーの場所が変わる
//エラーのところクイックフィックス　throwすると
//エラーがmethod1();に移動

}
}
