import java.util.Scanner;

public class strong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int n=num;
        int sum=0;
       // int cnt =0;
        while(n>0){
            sum = sum + fact(n%10);
            n = n/10;
        }
        System.out.println(sum);
        if(sum==num){
            System.out.println("is is a strong number");
            return;
        }
        System.out.println("It is not a strong number");

    }
    public static int fact(int n){
        if(n==1) return 1;
        return n * fact(n-1);
    }
}
