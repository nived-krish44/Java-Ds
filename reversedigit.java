import java.util.Scanner;

public class reversedigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  element");
        int n = sc.nextInt();
        int cnt =0;
        int rev =0;
        while(n!=0){
            rev = rev*10 + n%10;
            n=n/10;
            cnt++;
        }
        System.out.println("Number of digits "+ cnt);
        System.out.println("reverse "+rev);
    }
}
