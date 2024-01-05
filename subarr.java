// public class subarr {
//   public static void main(String args[]){
//     int []arr={1,2,3,5,6,7};
//     for(int i=0; i<arr.length; i++){
//       for(int j=i; j<arr.length; j++){
//         for(int k=i; k<j; k++){
//           System.out.print(arr[k]+" ");
//         }
//         System.out.println();
//       }
//     }
//   }
// }

public class subarr {
  public static void main(String[] args) {
    int[] arr = {12,3,4,5,6,4,5,8};
    System.out.println(check(arr, 4));
  }
 public static int check(int[] arr,int target) {
  int count =0;
       for(int i=0; i<arr.length; i++){
           if(arr[i]==target){
               count++;
           }
       }
  return count;
 }
  
}

