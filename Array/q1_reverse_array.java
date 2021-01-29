import java.util.Scanner;
class q1_reverse_array {
public static int[] reverse(int start, int end, int[] arr){
    if(start>=end)
      return arr;
    else{
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      return reverse(start+1, end-1, arr);
    }
  }
  public static void print(int[] arr){
    for(int i=0; i<arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    //enter values
    for(int i=0; i<size; i++)
      arr[i] = sc.nextInt();
    //print original array
    print(arr);
    //reverse array
    arr = reverse(0, size-1, arr);
    //print reverse array
    print(arr);
  }
  
  //time complexity = O(n);
}