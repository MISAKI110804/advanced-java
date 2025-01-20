package sample;

import java.time.LocalDateTime;

public class DateTimeSample3 {
  public static void main(String[] args) {
    // 年月日時分秒ナノ秒を指定、LocalDateTimeオブジェクトを生成
    LocalDateTime localDateTime = LocalDateTime.of(2028, 1, 2, 3, 4, 5, 99999990);

    //同じ変数に代入している（上書き）
    localDateTime = localDateTime.plusYears(1);
    localDateTime = localDateTime.plusMonths(2);
    localDateTime = localDateTime.plusDays(3);
    localDateTime = localDateTime.plusHours(4);
    localDateTime = localDateTime.plusMinutes(5);
    localDateTime = localDateTime.plusSeconds(6);
    localDateTime = localDateTime.plusNanos(7);
    System.out.println("進めた後︓" + localDateTime);

    //下記のように記載しないように注意。
    //localDateTime.plusYears(1);

    localDateTime = localDateTime.minusYears(1);
    localDateTime = localDateTime.minusMonths(2);
    localDateTime = localDateTime.minusDays(3);
    localDateTime = localDateTime.minusHours(4);
    localDateTime = localDateTime.minusMinutes(5);
    localDateTime = localDateTime.minusSeconds(6);
    localDateTime = localDateTime.minusNanos(7);
    System.out.println("戻した:"+localDateTime);
  }
}
