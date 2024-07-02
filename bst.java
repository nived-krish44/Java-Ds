import java.util.*;

public class bst {
    static int cnt =0;
    static node root;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = sc.nextInt();
        while(n>0){
            System.out.println("enter the number of nodes");
            int value = sc.nextInt();
            root =insert(value,root);
            n--;
    }
    inorder(root);
    System.out.println("enter the element to be deleted");
    int key = sc.nextInt();
    delete(root,key);
    inorder(root);
    
    
}
    static public node insert(int n,node root1){
        if(cnt==0){
            root = new node(n);
            cnt++;
            return root;
        }
        if(root1==null){
            node current = new node(n);
            return  current;
        }
        node current = root1;
        if(current.val<n){
            current.right =  insert(n,current.right);
        }
        else{
            current.left = insert(n,current.left);
        }
        return root1;
    }
    public static void inorder(node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static node delete(node root1,int key){
        if(root1==null) return null;
        if(root1.val<key){
            root1.right = delete(root1.right,key);
        }
        else if(root1.val>key){
            root1.left = delete(root1.left,key);
        }
        else{
            if(root1.left==null && root1.right==null){
                return null;
            }
            else if(root1.left==null){
                return root1.right;
            }
            else if(root1.right==null){
                return root1.left;
            }
            else{
                node in = inorderpre(root1.right);
                root1.val = in.val;
                root1.right = delete(root1.right,key);
            }
        }
        return root1;

    }
    public static node inorderpre(node root1){
        while(root1.left!=null){
            root1.left =root1;
        }
        return root1;
    }

}
class node{
    int val;
    node left;
    node right;
    public node(int n){
        val = n;
        left = null;
        right = null;
    }
}
