import java.util.*;
public class Factorial{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number; ");
    int n=sc.nextInt();
    int fact=1;
    int i=1;
    while(i<=n){
      fact*=1;
      i++;
    }
    System.out.println("Factorial=" +fact);
  }
}
