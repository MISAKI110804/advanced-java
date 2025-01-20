package sample;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Ex07 {
public static void main(String[] args) {
  
  LocalDate date = LocalDate.of(1996,3,24);

  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

  System.out.println(date.format(formatter));

}

}

