import java.util.Scanner;

public class catalan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] fact = new long[2*n+1];
        fact(2*n,fact);
        long[] res = new long[n+1];
        //for(int nums: fact) System.out.print(nums+ " ");
        for(int i=1;i<=n;i++){
            res[i] = fact[2*i]/(fact[i+1]*fact[i]);
            System.out.print(res[i]+" ");
        }

    }
    public static long fact(int n,long[] fact){
        if(fact[n]!=0) return fact[n];
        if(n==1){
            fact[1]=1;
            return 1;
        }
        fact[n] = n * fact(n-1,fact);
        return fact[n];
    }
}
