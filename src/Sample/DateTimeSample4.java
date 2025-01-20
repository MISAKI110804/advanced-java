package sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeSample4 {
public static void main(String[] args) {
  // ⽇付を表すクラス
  LocalDate localDate = LocalDate.now();
  System.out.println("現在の⽇付︓" + localDate);
  System.out.println("⽉末は" + localDate.with(TemporalAdjusters.lastDayOfMonth()));
  // 時間を表すクラス
  LocalTime localTime = LocalTime.now();
  System.out.println("現在の時間︓" + localTime);
  // LocalTimeは⽉の情報がないため使⽤できない
  // System.out.println("⽉末は"+ localTime.with(TemporalAdjusters.lastDayOfMonth()));
  // ⽇付と時間
  LocalDateTime localDateTime = LocalDateTime.now();
  System.out.println("現在の⽇付と時間︓" + localDateTime);
  System.out.println("⽉末は"+ localDateTime.with(TemporalAdjusters.lastDayOfMonth()));

}
}
