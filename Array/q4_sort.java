//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
import java.util.*;
class q4_sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.print(">>");
            arr[i] = sc.nextInt();
        }

        int i=0, j=0, zero=0, one=0, two=0;

        for(i=0; i<size; i++){
            if(arr[i] == 0)
                zero++;
            else if(arr[i] == 1)
                one++;
            else
                two++;
        }

        System.out.println("Zero:"+zero+"\nOne:"+one+"\nTwo:"+two);
        for(i=0; i<zero; i++)
            arr[i]=0;
        for(j=i; j<(i+one); j++)
            arr[j] = 1;
        for(i=j; i<(j+two); i++)
            arr[i] = 2;

        for(i=0; i<size; i++)
            System.out.print(arr[i]+" ");


    }
}