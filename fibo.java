import java.util.*;
public class fibo {
    static HashMap<Integer,Integer> memo = new HashMap<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int res = fibo(n);
        System.out.println(res);
    }
    public static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(memo.get(n)!=null){
            return memo.get(n);
        }
        return fibo(n-1) + fibo(n-2);
    }
    
}
