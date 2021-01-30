public class FindOdd {
  public static int findIt(int[] a) {
    int odd = 0; // place to store our answer
    for(int num: a) {
      if(countOccurrences(a, num) % 2 != 0) {
        odd = num;
      }
    }
    return odd;
  }

  public static int countOccurrences(int[] arr, int num) {
    int count = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == num) {
        count++;
      }
    }
    return count;
  }
}
