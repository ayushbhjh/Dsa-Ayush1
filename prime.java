public class prime {
  public static void main(String args[]){
    int a=29;
    System.out.println(check(a));

    int b =100;
        int sum=0;
        for(int j =2; j<=b; j++){
            if(check(j)==true){
                sum+=j;
               System.out.println(j);
            }
           
        }
         System.out.println(sum);
  }
  public static boolean check(int a){
    boolean isprime =true;
    for(int i=2; i<a; i++){
      if(a%i==0){
        isprime =false;
      }
    }
    return isprime;
  }
}
