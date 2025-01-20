package sample;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeSample1 {
public static void main(String[] args) {
  //日付
  //LocalDateというクラス名
  //nowはローカルデータのインスタンスを返す
  //右辺から処理していく。

  //だめ
  //LocalDate localDate = new LocalDate();

  LocalDate localDate = LocalDate.now();
  System.out.println(localDate);
  //時間
  LocalDateTime localDateTime = LocalDateTime.now();
  System.out.println(localDateTime);
}
}
