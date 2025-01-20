package sample;

public class Car {
private int speed;
public void run()throws Exception

{
  speed +=10;
if(speed>=120){
  //120以上になったら例外を発生させる
  throw new OverSpeedException("スピードの出し過ぎです");
  //呼び出しもとにthrowするよ
  //OverSpeedExceptionが検査例外のため赤波線。

}
}
}
