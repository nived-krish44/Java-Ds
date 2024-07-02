import java.util.Scanner;

public class singlell {
    static int cnt =0;
    static ll head = new ll();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // System.out.println("Enter the size of element");
        // int n = sc.nextInt();
        // int x=1;
        while(true){
            System.out.print("enter the choice");
            int choice = sc.nextInt();
            if(choice ==1){
                addAtEnd();
                continue;
            }
            else if(choice==2){
                addAtFront();
                continue;
            }
            else if(choice==3){
                addAtAnypos();
                continue;
            }
            // else if(choice==4){
            //     deleteAtfront();
            //     continue;
            // }
            // else if(choice==5){
            //     deleteAtEnd();
            //     continue;
            // }
            // else if(choice==6){
            //     deleteAtpos();
            //     continue;
            // }
            else if(choice==7){
                display();
                break;
            }
            else {
                break;
            }

        // while(x<n){
        //     System.out.println("Enter the elements");
        //     ll temp = new ll(); 
        //     value = sc.nextInt();
        //     temp.val = value;
        //     current.next = temp;
        //     current = current.next;
        //     x++;
        // }
        // System.out.println("The elements"); 
        // current = head;
        // while(current!=null){
        //     System.out.println(current.val + " ");
        //     current=current.next;
        // }
       
    }
} 
    public static void addAtEnd(){
        System.out.println("Enter the elements"); 
        int value = sc.nextInt();
        if(cnt<=0){
            head.val = value;
        } 
        ll current = new ll();
        current = head;
        while(current.next!=null){
            current=current.next;
        }
        ll temp = new ll();
        temp.val=value;
        current.next=temp;
        cnt++;
    return;
    }
    public static void addAtFront(){
        System.out.println("Enter the elements"); 
        int value = sc.nextInt();
        ll temp = new ll();
        temp.val=value;
        temp.next = head;
        head = temp;
        cnt++;
    }
    public static  void addAtAnypos(){
        System.out.println("Enter the position of the element"); 
        int n= sc.nextInt();
        System.out.println("Enter the elements"); 
        int value = sc.nextInt();
        ll current = head;
        ll prev = new ll();
        while(n>0){
            prev = current;
            current=current.next;
            n--;
        }
        ll temp = new ll();
        temp.val=value;   
        prev.next = temp;
        temp.next=current.next;
        cnt++;
    }
    public static void display(){
        ll current = head;
        while(current!=null){
            System.out.print(current.val+ " ");
            current = current.next;
        }
    }
}


    static class ll{
        int val;
        ll next;
    }
