package sample;

public class Car2 {
  private int speed ;

  // 操作
  public void run(int speed) {
    if (speed < 0 || speed > 180) {
      throw new IllegalArgumentException("スピードの出し過ぎです");
      //IllegalArgumentExceptionの場合には検査対象なのでエラーが出ず、自分でcatch&tryをする。
    } else if (speed >= 0 && speed <= 180) {
      this.speed = speed;
      System.out.println("スピードが" + this.speed + "km/hになりました");
    }
  }
}
