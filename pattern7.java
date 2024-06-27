import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int k=n/2;
        int j=2;
        int l=k;
        for(int i=1;i<=n;i++){
            if(i==1||i==n){
                System.out.print(" ".repeat(k+1));
                System.out.print("1");

            }
            else if(i<(k+1)){
                System.out.print(" ".repeat(k-j+1));
                System.out.print(j);
                System.out.print(" ".repeat(2*(j-1)));
                System.out.print(j);
                j++;
            }
            else if(i==(k+1)){
                System.out.print(i);
                System.out.print(" ".repeat(2*i-3+1));
                System.out.print(i);
            }
            else{
                System.out.print(" ".repeat(k-l+1));
                System.out.print(l);
                System.out.print(" ".repeat(2*(l-1)));
                System.out.print(l);
                l--;
            }
            System.out.println();
        }
    }}