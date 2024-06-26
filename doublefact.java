import java.util.*;

public class doublefact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element");
        int n = sc.nextInt();
        int res = doublefac(n);
        System.out.println(res);
    }

    public static int doublefac(int n){
        if(n==0||n==-1){
            return 1;
        }
    return n*doublefac(n-2);
    }
}
