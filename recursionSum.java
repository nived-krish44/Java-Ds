import java.util.*;

public class recursionSum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number of eleemnts");
        int n = sc.nextInt();
        int sum = SumAvg(n);
        System.out.println("Sum : "+sum);
        System.out.println("Avg : "+(float)sum/n);

    }
    public static int SumAvg(int n){
        if(n==0) return 0;
        System.out.println("enter the element");
        int val = sc.nextInt();
        return val + SumAvg(n-1);
    }
    
}
