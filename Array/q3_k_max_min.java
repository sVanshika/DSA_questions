//Find the "Kth" max and min element of an array 
import java.util.*;
class q3_k_max_min{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = sc.nextInt();
        System.out.print("K:");
        int k=sc.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++){
            System.out.print(">>");
            arr[i] = sc.nextInt();
        }
        
        int[] sorted_arr = new int[size];
        int temp=0, pos=0;

        for(int i=0; i<size; i++){
            temp=arr[i];
            pos=i;
            for(int j=i; j<size; j++){
                if(arr[j] < temp){
                    temp = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<size; i++)
            System.out.print(arr[i]+" ");

        System.out.println(k+"th Max: "+arr[size-k]+"\n"+k+"th Min: "+arr[k-1]);
        

    }
}