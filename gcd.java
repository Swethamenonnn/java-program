import java.util.*;
public class GCD{
  public static void main(String[]args)
  {
    Scannner sc=new Scanner(System.in);
    System.out.println("enter 2 nos");
    int a=sc.nextInt();
    int b=sc.nextInt();
    while(a!=b){
      if(a>b)
        a=a-b;
      else
        b=b-a;
    }
    System.out.println("GCD is"+a);
  }
}
