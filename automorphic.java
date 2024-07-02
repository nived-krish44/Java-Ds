import java.util.*;

public class automorphic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String val = "" + n;
        int len = val.length();
        int sqr = n*n;
        String res= "";
        while(len>0){
            int d =sqr%10;
            res = d + res;
            sqr = sqr/10;
            len--;
        }
        if(val.equals(res)){
            System.out.println("It is an automorphic number");
            return;
    }
    System.out.println("It is not automorphic number");


    }
}
