import java.util.*;

public class monoton {
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
        int diff=0;
        int diff1=0;
        for(int i=1;i<n;i++){
            diff1=diff+ (arr[i]-arr[i-1]);
            
            if(Math.abs(diff)>Math.abs(diff1)){
                System.out.println("it is not monotonic");
                return;
            }
            diff= diff1;
        }
        System.out.println("Array is monotonic");
    }
}
