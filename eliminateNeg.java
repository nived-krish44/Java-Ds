import java.util.*;

public class eliminateNeg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        sc.nextLine();
       // int[] arr = new int[n];
        String[] res = new String[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            res[i] = sc.nextLine();
            //res[i]=val;
        }
        for(int i=0;i<res.length;i++){
            if(res[i].charAt(0)=='-'){
                res[i]="*";
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
