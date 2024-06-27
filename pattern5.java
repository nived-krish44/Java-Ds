import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        //int k = n / 2;
        for(int i=1;i<=n;i++){
            if(i==1||i==n){
                System.out.print("*".repeat(n));
            }
            else{
                System.out.print("*");
                System.out.print(" ".repeat(n-2));
                System.out.print("*");
            }
            System.out.println();                                                                                                                           
        }


    }}