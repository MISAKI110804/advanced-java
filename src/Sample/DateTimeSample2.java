package sample;

import java.time.LocalDateTime;

public class DateTimeSample2 {
public static void main(String[] args) {
  //年月日時分秒ナノ秒を指定してLocalDateTimrオブジェクトを生成
  LocalDateTime localDateTime = LocalDateTime.of(2025,1,2,3,4,5,9999999);
  System.out.println("日付と時間:"+localDateTime);


//年月日時分秒ナノ秒を一つずつ取り出し
int month = localDateTime.getMonthValue();
System.out.println("月:"+month);


int dayOfMonth = localDateTime.getDayOfMonth();
System.out.println("日:"+dayOfMonth);

}
}
