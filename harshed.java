import java.util.*;

public class harshed {
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
        if(num%sum==0) {System.out.println("it is a harshad number"); return;}
        System.out.println("it is not a harshad number");
        
    }
    
}

