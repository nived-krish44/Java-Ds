import java.util.*;

public class magic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int n=num;
        int sum=0;
        while(n>0){
            sum = sum + n%10;
            n=n/10;
        }
        String s = "";
         n = sum;
        while(n>0){
            s = s + n%10;
            n=n/10;
        }
        System.out.println(sum);
        n = Integer.parseInt(s);
        System.out.println(n);
        if(num==(n*sum)) {System.out.println("it is a magic number"); return;}
        System.out.println("it is not a magic number");
        
    }
    
}
