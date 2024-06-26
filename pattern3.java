import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(i<n/2){
                for(int j=0;j<=n/2-i;j++){
                    System.out.print(" ");
                    cnt++;
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=n/2;j<=i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n-i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println(cnt);
    }  
}

    

