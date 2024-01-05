import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Arr_Arrlist {
  public static void main(String args[]){
    int []arr = {1,2,3,4,5,5};
    System.out.println(Arrays.toString(arr));
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
  }
}
