import java.util.*;
public class linearSearch {
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
        System.out.println("Enter the element to search");
        int key = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("ELement found");
                System.out.println(i);
                return;
            }
        }
        System.out.println("Element not found");

    }
    
}
