public class Primenumbersbetween1to100{
  public static void main(String[]args){
    for(inti+=2;i<=100;i++)
      {
        boolean isPrime=true;
        for(int j=2;j<=1/2;j++){
          if(i%j==0){
            isPrime=false;
            break;
          }
        }
        if(isPrime)
          System.out.println(i);
      }
  }
  ]
