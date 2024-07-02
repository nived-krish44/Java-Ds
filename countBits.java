import java.util.Scanner;

public class countBits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n+1];
        res[0]=0;
        if(n==0){
            System.out.println("0");
        }
       res[1]=1;
       int p = 1;
       for(int i=2;i<=n;i++){
        if(i==(int)Math.pow(2,p)){
            res[i]=1;
            p++;
            
        }
        else{
            int x = i-(int)Math.pow(2,p-1);
            res[i]=1+res[x];
        }
       }
       for(int nums : res) System.out.print(nums + " ");
    }
}
