public class maxarr {
  public static void main(String args[]){
    int []numbers={3,1,2,5,6};
    int max=findmax(numbers);
    System.out.println("maximum number: " + max);
  }
  public static int findmax(int[]arr){
    int max=0;
    for(int i=0; i<arr.length; i++){
      if(max<arr[i]){
        max=arr[i];
      }
    }
    return max;
  }
}
