import java.util.*;

public class secondLarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            arr[i]=val;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>=largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }
    
    System.out.println(secondLargest);
            }
}
