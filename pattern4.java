import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int k = n / 2;

        for (int i = 1; i <= n/2+1; i++) {
           
            for (int j = 1; j <=(k+1-i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <=2*i-2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i=0;i<n;i++) System.out.print("*");
        // System.out.println();
        for (int i = n/2; i >= 1; i--) {
           
            for (int j = 1; j <=(k+1-i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <=2*i-2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
