import java.util.*;

public class queuell {
    static int front=-1;
    static int rear = -1;
    static lll head = new lll();
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("Enter the choice of element");
        System.out.println("1.push\n2.pop\n3.display\n4.isEmpty\n5.size\nother for exit");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Enter the element");
            int t = sc.nextInt();
            enqueue(t);
                continue;
        }
        else if(n==2){
            int k = dequeue();
            if(k==-1){
                System.out.println("underflow");
            }
            else{
                System.out.println(k);
            }
            continue;

        }
        else if(n==3){
            display();
            continue;
        }
        else if(n==4){
            if(isEmpty()){
                System.out.println("it is empty");
            }
            else{
                System.out.println("it is not empty");
            }
            continue;
        }
        else if(n==5){
            System.out.println(size());
            continue;
        }
        else {
            break;
        }
    }
    
    
   

}
public static void enqueue(int n){
    if(rear==-1){
        head.val=n;
        front++;
        rear++;
        return;
    }
    //int x = 0;
    lll temp = new lll();
    temp = head;
    //lll prev = new lll();
    while(temp.next!=null){
        temp=temp.next;
    }
    lll topp = new lll();
    topp.val = n;
    temp.next=topp;
    rear++;
    // if(top==9){
    //     return -1;
    // }
    // lll[top] = n;
} 
public static int dequeue(){
    if(front>rear){
        return -1;
    }
    //int x = front;
    //lll prev = new lll();
    //lll temp = new lll();
    //temp=head;
    // //prev= temp;
    // while(temp.next!=null){
    //     prev= temp;
    //     temp = temp.next;
    // }
    int res = head.val;
    head= head.next;
    front++;
    return res;
}

public static boolean isEmpty(){
    if(front>=rear){
        return true;
    }
    return false;
}
public static int size(){
    return rear-front +1;
}
public static void display(){
    //int x=0;
    lll temp = new lll();
    temp = head;
    while(temp!=null){
        System.out.println(temp.val);
        temp=temp.next;
    }
}
}
class lll{
    int val;
    lll next ;
    // public void lll(int n){
    //     this.n = n;
    //     this.next = null;
    // }
}

