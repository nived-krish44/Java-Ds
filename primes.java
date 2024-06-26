import java.util.*;

public class primes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first element");
        int n = sc.nextInt();
        //int[] arr = new int[n];
        System.out.println("Enter the second elements");
        int n2 = sc.nextInt();
        List<Integer> prime = new ArrayList<>();
        for(int i=n;i<=n2;i++){
            if(isPrime(i)){
                prime.add(i);
            }  
        }
        for(int nums: prime){
            System.out.println(nums);
        }
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
}
