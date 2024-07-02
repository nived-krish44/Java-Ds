import java.util.Scanner;

public class happy {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        //int n=num;
        //int sum=0;
        //int cnt =0;
        if(happyNo(num)){
            System.out.println("It is a happy number");
            return;
        }
        System.out.println("It is not a happy number");
    }
    public static boolean happyNo(int num){
        int n =num;
        int sum =0;
        int cnt =0;
        // while(n>0){
        //     n=n/10;
        //     cnt++;
        // }
        //n=num;
        while(n>0){
            sum = sum + (int)Math.pow(n%10,2);
            n=n/10;
        }
        String val = "" + sum;
        boolean res = false;
        if(val.length()>1){
            res = happyNo(sum);
        }
        else if(sum==1){
            return true;
        }
        else{
            return false;
        }
        return res;
    }
}
