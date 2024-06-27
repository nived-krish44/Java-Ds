import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
       // int k = n / ;
        for(int i=1;i<=n;i++){
            if(i==1||i==n){
                System.out.print("*".repeat(n-1));
            }
            else{
                System.out.print("*");
                System.out.print(" ".repeat(Math.abs(n/2-(i-1))));
                System.out.print("*");
            } 
            System.out.println();                                                                                                                           
        }


    }}