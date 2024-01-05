public class gcd {
  public static void main(String args[]){
    int a =10; int b =30;
    int min= Math.min(a, b);
    for(int i=min; i>0; i--){
     if(a%i==0&&b%i==0){
      System.out.println("the gcd of no a and b"+ " "+ i);
      break;
     }
    }
  }
}
