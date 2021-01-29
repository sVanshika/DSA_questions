//Find the maximum and minimum element in an array
import java.util.*;
class q2_min_max_arr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int max=0, min=Integer.MAX_VALUE;

        for(int i=0; i<size; i++){
            System.out.print(">>");
            arr[i] = sc.nextInt();

            if(arr[i] > max)
                max=arr[i];
            if(arr[i] < min)
                min=arr[i];
        }
        
        System.out.println("Max: "+max+"\nMin: "+min);

    }
}