import java.util.*;

public class fascinating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numnber");
        int val = sc.nextInt();
        int mul2 = val*2;
        int mul3 = val*3;
        int[] arr = new int[10];
        while(val>0){
            int d = val%10;
            arr[d]++;
            val=val/10;
        }
        while(mul2>0){
            int d = mul2%10;
            arr[d]++;
            mul2=mul2/10;
        }
        while(mul3>0){
            int d = mul3%10;
            arr[d]++;
            mul3=mul3/10;
        }
        for(int i=1;i<10;i++){
            if(arr[i]!=1){
                System.out.println("It is not fascinating");
                return;
            }
        }
        System.out.println("It is fascinating");

 
    }
}
