import java.util.Arrays;
public class reversearr {
  public static void main(String args[]) {
    int[] numbers = { 1, 2, 3, 4, 5, 6 };
    reverse(numbers);
    System.out.println("reversed arr" + Arrays.toString(numbers));
  }

  public static void reverse(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }

  }
}
