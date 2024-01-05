public class ques1 {
  public static void main(String args[]){
    int []numbers={1,2,3,4,5};
    double[]result=calculatesumandavg(numbers);
    System.out.println("sum"+result[0]);
    System.out.println("average"+ result[1]);
  }
  public static double[] calculatesumandavg(int []arr){
    double []result=new double[2];
    int sum=0;
    for(int i=0; i<arr.length; i++){
     sum+=arr[i];
    }
    result[0]=sum;
    result[1]=sum/arr.length;
    return result;
  }
}
