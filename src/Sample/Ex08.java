package sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex08 {
public static void main(String[] args) {
  
  LocalDate date = LocalDate.of(2020,2,1);
  System.out.println(date);

  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

  System.out.println(date.format(formatter));
}
}
