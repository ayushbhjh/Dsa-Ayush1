public class fab {
  public static void main(String args[]) {
    int a = 0;
    int b = 1;
    int c;
    for(int i=1;i<=20; i++){
      c=a+b;
      System.out.println(a+b);
      a=b;
      b=c;
    }
  }
}
