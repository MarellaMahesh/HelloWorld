import java.util.*;

class MathUtil{
  int a=10, b=20;
  public static void main(String args[]){
    System.out.println(sum());
    System.out.println(sub());
  }
  private int sum(){
    return a+b;
  }
   private int sub(){
    return a-b;
  }
}
