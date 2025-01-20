package sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Ex08 {
public static void main(String[] args) {
  //localDateオブジェクトを生成
  LocalDate date = LocalDate.of(2020,2,1);
  //TemporalAdjustersを使って2月の最後の日を取得
  LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
  //int型で取得し
  int dayOfMonth = lastDayOfMonth.getDayOfMonth();
  //表示
  System.out.println(dayOfMonth);


}
}
