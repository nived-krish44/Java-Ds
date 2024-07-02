import java.util.*;

public class duplicate {
    static Scanner sc = new Scanner(System.in);
    static int cnt=0;
    static ll head = new ll();
    static HashSet<Integer> set = new HashSet<>();
    
    public static void main(String[] args){
        System.out.println("Enter the elements"); 
        int n = sc.nextInt();
        int x=0;
        while(x<n){
            System.out.println("Enter the elements"); 
            int value = sc.nextInt();
            if(cnt==0){
                head.val = value;
                //System.out.print("head creted");
                cnt++;
            }
            else{
                ll current = new ll();
                current = head;
                while(current.next!=null){
                    current=current.next;
                }
                ll temp = new ll();
                temp.val=value;
                current.next=temp;
                cnt++;
            }
            x++;
        }
        //System.out.print("Hiii");
        ll current = head;
        while(current!=null){
            System.out.print(current.val + " ");
            current=current.next;
        }
        System.out.println();
        current = head;
        ll prev = new ll();
        while(current!=null){
            if(set.contains(current.val)){
                prev.next = current.next;
                current=current.next;
            }
            else{
                set.add(current.val);
                prev = current;
                current=current.next;
            }

        }
        current = head;
        while(current!=null){
            System.out.print(current.val + " ");
            current=current.next;
        }

    }
}
static class ll{
    int val ;
    ll next;
}
