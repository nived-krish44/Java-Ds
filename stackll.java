import java.util.*;

public class stackll {
    static int top=-1;
    static ll head = new ll();
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("Enter the choice of element");
        System.out.println("1.push\n2.pop\n3.display\n4.isEmpty\n5.size\nother for exit");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Enter the element");
            int t = sc.nextInt();
            push(t);
                continue;
        }
        else if(n==2){
            int k = pop();
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
public static void push(int n){
    if(top==-1){
        head.val=n;
        top++;
        return;
    }
    //int x = 0;
    ll temp = new ll();
    temp = head;
    //ll prev = new ll();
    while(temp.next!=null){
        temp=temp.next;
    }
    ll topp = new ll();
    topp.val = n;
    temp.next=topp;
    top++;
    // if(top==9){
    //     return -1;
    // }
    // ll[top] = n;
} 
public static int pop(){
    if(top<0){
        return -1;
    }
    int x = top;
    ll prev = new ll();
    ll temp = new ll();
    temp=head;
    prev= temp;
    while(temp.next!=null){
        prev= temp;
        temp = temp.next;
    }
    int res = temp.val;
    prev.next= null;
    top--;
    return res;
}

public static boolean isEmpty(){
    if(top<0){
        return true;
    }
    return false;
}
public static int size(){
    return top;
}
public static void display(){
    //int x=0;
    ll temp = new ll();
    temp = head;
    while(temp!=null){
        System.out.println(temp.val);
        temp=temp.next;
    }
}
}
class ll{
    int val;
    ll next ;
    // public void ll(int n){
    //     this.n = n;
    //     this.next = null;
    // }
}

