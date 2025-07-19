import java.util.*;
public class Fibonacci{
  public static void main(Strings[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enteer the limit");
    int limit=sc.nextInt();
    int a=0,b=1;
    System.out.println("fibonacci series " + a + ",+b);
    int c=a+b;
    while(c<=limit){
      System.out.println(","+" c);
      a=b;
      b=c;
      c=a+b;

    }
  }
}
