import java.util.*;

public class queue {
    static int front=-1;
    static int rear=-1;
    static int[] queue = new int[10];
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("Enter the choice of element");
        System.out.println("1.enque\n2.deque   \n3.display\n4.isEmpty\n5.size\nother for exit");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Enter the element");
            int t = sc.nextInt();
            int k =enqueue(t);
            if(k==-1){
                System.out.println("Overflow");
            }
                continue;
        }
        else if(n==2){
            int k = dequeue();
            if(k==-1){
                System.out.println("underflow");
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
public static int enqueue(int n){
    if(rear==9){
        return -1;
    }
    if(front==-1 && rear==-1){
        front++;
    }
    rear++;
    queue[rear] = n;
    return 1;
} 
public static int dequeue(){
    if(front>=rear){
        return -1;
    }
    int res = queue[front];
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
    return rear-front;
}
public static void display(){
    for(int nums=front;nums<=rear;nums++){
        System.out.println(queue[nums]);
    }
}
}
