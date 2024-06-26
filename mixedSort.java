import java.util.*;

public class mixedSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n/2];
        int[] arr2 = new int[n-(n/2)];
        System.out.println("Enter the elements");
        int j=0;
        for(int i=0;i<n;i++){
            if(i<arr1.length){
                arr1[i]=sc.nextInt();
            }
            else{
                arr2[j]=sc.nextInt();
                j++;
            } 
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int k=0;
        for(int i=0;i<n;i++){
            if(i<arr1.length){
            arr[i]=arr1[i];
            }
            else{
                arr[i]=arr2[arr2.length-1-k];
                k++;
            }

        } 
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
    }
}
