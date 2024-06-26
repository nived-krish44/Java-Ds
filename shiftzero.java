import java.util.*;
public class shiftzero {
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
        int zero=0;
        //int nzero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) zero++;
            else{
                arr[i-zero]=arr[i];
            }
        }
        for(int i=n-1;i>n-1-zero;i--) arr[i]=0;
        for(int nums: arr){
            System.out.print(nums+" ");
        }
    }
}
