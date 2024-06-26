import java.util.*;

public class addition {
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  element");
        int n1 = sc.nextInt();
        System.out.println("Enter the second element");
        int n2 = sc.nextInt();
        String b1 = Integer.toBinaryString(n1);
        String b2 = Integer.toBinaryString(n2);
        int carry =0;
        String res = "";
        int ln1 = b1.length();
        int ln2 = b2.length();
        int x = Math.max(ln1,ln2);
        for(int i=0;i<10;i++){
            ln1 = b1.length();
            ln2 = b2.length();
            if(ln2<10) b2 = 0 + b2;
            if(ln1<10) b1 = 0 + b1;
        }
        for(int i=9;i>=0;i--){
            int bit1 = b1.charAt(i) - '0';
            int bit2 = b2.charAt(i) - '0';
            if(bit1==1 && bit2==1) carry =1;
            else carry =0;
            res = (bit1 ^ bit2 ^carry) + res;
        }
        int integerValue = Integer.parseInt(res, 2); 
        System.out.println(integerValue);

    }}
