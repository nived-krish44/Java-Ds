import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        int k=1;
        int cnt=1;
        int l=2;
        int i=1;
        int j=1;
        while(j<=n){
            System.out.print(Math.pow(i,2)*k + " ");
            k*=-1;
            if(i==cnt){
            System.out.println();
            cnt=cnt+l;
            l++;
            j++;
            }
            i++;

        }
    }  
}

    

