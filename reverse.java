import java.util.Scanner;

public class reverse {
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
        int small = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            small = arr[i]<small ? arr[i] : small;
                }
    
    System.out.println(small);
            }
}
