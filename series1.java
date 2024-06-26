import java.util.Scanner;

public class series1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        System.out.println("1 ");
        for(int i=1;i<n;i++){
            System.out.println((i+1)*2+" ");
        }
    }
    
}
