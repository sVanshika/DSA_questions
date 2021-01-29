//Move all the negative elements to one side of the array 
import java.util.*;
class q5_negative_elements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.print(">>");
            arr[i] = sc.nextInt();
        }

        int count=0, i=0, temp=0;

        for(i=0; i<size; i++){
            if(arr[i] < 0){
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        for(i=0; i<size; i++)
            System.out.println(arr[i]+" ");
    }
}