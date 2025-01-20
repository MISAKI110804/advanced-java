package sample;

import java.time.LocalDateTime;

public class Ex09 {
public static void main(String[] args) {
  LocalDateTime localDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 0);

  LocalDateTime answerDateTime = localDateTime;
  .plusYears(1);
  .plusMonths(2);
  .plusDays(3);
  .plusHours(4);
  .plusMinutes(5);
  .plusSeconds(6);
System.out.println(answerDateTime);

}
}
