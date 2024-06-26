import java.util.*;
public class business {
    static Scanner sc = new Scanner(System.in);
    static int limit =10;
    public static void main(String[] args){
        //List<Integer> track = new ArrayList<>();
        System.out.println("enter the command");
        int n = 0;
        while(n<3){
            System.out.println("1: buy");
            System.out.println("2: track");
            System.out.println("3: exit");
            n=sc.nextInt();
            if(n==1) buy();
            else if(n==2) track();
        }
        
    }
    public static void buy(){
        limit--;
        if(limit>0){
            System.out.println(limit + "no of stock remains");

        }
        else {
            System.out.println("limit exceeds cant sell");
        }
    }
    public static void track(){
        int sales = 10-limit;
        System.out.println("total sales today: " + sales);
        System.out.println("total stocks to buy: " + sales);
        limit=10;
    }
}
