import java.util.*;
public class Leapyear{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a year");
    int year=sc.nextInt();
    String result=(year%4==0&&year%100!=0)||(year%400==0)?"leap year":"not a leap  year";
    System.out.println("result");
  }
}
