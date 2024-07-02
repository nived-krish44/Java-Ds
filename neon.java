import java.util.Scanner;

public class neon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        //int n=num;
        int sum=0;
        //int cnt =0;
        int sqr = num* num;
        while(sqr>0){
            sum = sum + sqr%10;
            sqr = sqr/10;
        }
        if(sum==num){
            System.out.println("It is a neon number");
            return;
        }
        System.out.println("It is not a  neon number");
    }
}
