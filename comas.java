import java.util.Scanner;

public class comas {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        int n = sc.nextInt();
        if(n<1000) {System.out.println("0");
        return;
    }
    int p=0;
    int x =1000;
    int temp=n;
    String s ="";
    s = s+n;
    p=s.length();
    p=(p-1)/3;
    //System.out.println(p);
    int sum=0;
    while(temp>1000){
        int sub = (int)Math.pow(1000,p);
        //System.out.println(sub);
        sum = sum + (temp-sub+1)*p;
        temp=sub-1;
        p--;
    }
    System.out.println(sum);
    
}
}