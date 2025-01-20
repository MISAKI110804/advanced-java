package sample;

public class Ex15 {
  public static void main(String[] args) {
    Car2 car2 = new Car2();
   
    car2.run(40);
    try{
    car2.run(200);
    }
    catch(Exception e){
      System.out.println("スピードの出し過ぎです");
    }

}
}