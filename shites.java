import java.util.Scanner;

public class shites {
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
        int neg =0;
        int zero =n-1;
        //int i=0;
        for(int i=0;i<=zero;i++){
            if(arr[i]<0){
                int temp = arr[i];
                for(int k=i-1;k>=neg;k--){
                    arr[k+1] = arr[k];
                }
                arr[neg]=temp;
                neg++;
            }
            else if(arr[i]==0){
                int temp=arr[i];
                for(int j = i;j<zero;j++){
                    arr[j] = arr[j+1];
                }
                arr[zero]=temp;
                zero--;
                i--;
            }
        }
        for(int nums: arr){
            System.out.print(nums+ " ");
        }
    }
    
}