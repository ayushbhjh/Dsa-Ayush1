public class factorial {
  public static void main(String args[]){
    int a=10;
    int res = fact(a);
    System.out.println(res);
  }
  public static int fact(int a){
    int fact=1;
    for(int i=1; i<=a; i++){
      fact=fact*i;
    }
    return fact;
  }
}
