public class stringrev {
  public static void main(String args[]){
    String a = "hello";
    String b= reverse(a);
    System.out.println(b);

  }
  public static String reverse(String a){
    if(a==null){
      return null;
    }
    StringBuilder sb = new StringBuilder(a);
    sb.reverse();
    return sb.toString();
  }
}
