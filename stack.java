import java.util.*;

public class stack {
    static int top=-1;
    static int[] stack = new int[10];
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("Enter the choice of element");
        System.out.println("1.push\n2.pop\n3.display\n4.isEmpty\n5.size\nother for exit");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Enter the element");
            int t = sc.nextInt();
            int k =push(t);
            if(k==-1){
                System.out.println("Overflow");
            }
                continue;
        }
        else if(n==2){
            int k = pop();
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
public static int push(int n){
    if(top==9){
        return -1;
    }
    top++;
    stack[top] = n;
    return 1;
} 
public static int pop(){
    if(top<0){
        return -1;
    }
    int res = stack[top];
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
    for(int nums:stack){
        System.out.println(nums);
    }
}
}
