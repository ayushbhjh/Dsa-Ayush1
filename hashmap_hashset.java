import java.util.HashMap;
import java.util.HashSet;
public class hashmap_hashset {
  public static void main(String args[]){
      HashSet<String> set= new HashSet<>();
      set.add("Ayush");
      set.add("rahul");
      set.add("Raushan");
      System.out.println(set);
      HashMap<String,Integer> map = new HashMap<>();
      map.put("Ayush",19);
      map.put("rahul",20);
      map.put("shubham" , 21);
      System.out.println(map);
  }
}
