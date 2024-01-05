public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        check(0,1,10);

    }

    public static void check(int a,int b,int n) {
        if(n==0){
            return ;
        }
        System.out.println(a+b);
      check(b,a+b,n-1);
    }
}
