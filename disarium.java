import java.util.Scanner;

public class disarium {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int n=num;
        int sum=0;
        int cnt =0;
        while(n>0){
            n=n/10;
            cnt++;
        }
        n=num;
        while(n>0){
            sum = sum + (int)Math.pow(n%10,cnt);
            n = n/10;
            cnt--;
        }
        System.out.println(sum);
        if(sum==num){
            System.out.println("It is a dissarium number");
            return; 
        }
        System.out.println("It is not a dissarium number");
    }
}
