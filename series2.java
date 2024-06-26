import java.util.*;
public class series2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        int k =1;
        int cnt=0;
        int i=0;
        while(cnt<n){
            if(i%4==0){
                i++;
                continue;
            } 
            System.out.println(i*k+" ");
            k*=-1;
            cnt++;
            i++;
        }
    }
}
