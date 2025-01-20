package sample;

public class Ex05 {
public static void main(String[] args) {
  //変数bigNumberに代入
  String bigNumber = "\"阿僧祇(あそうぎ):那由他(なゆた):不可思議(ふかしぎ):無量⼤数(むりょうたいすう)\"";

  String[] result = bigNumber.split(":");
  for(String word :result){
    System.out.println(word);
  }
}
}
