import java.util.Scanner;

public class treetraversal {
    static tree root;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        root = new tree(1);
        root.left = new tree(2);
        root.right = new tree(3);
        root.left.left = new tree(4);
        root.left.right = new tree(5);
        root.right.left = new tree(6);
        root.right.right = new tree(7);
        while(true){
            System.out.println("\n1.Inorder\n2.PostOrder\n3.PreOrder\n");
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            if(choice==1) {inorder(root); continue;}
            else if(choice==2) {postorder(root); continue;}
            else if(choice==3) {preorder(root); continue;}
            else break;
        }
    }
    public static void inorder(tree root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void preorder(tree root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(tree root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    
}
 class tree{
    int val;
    tree left;
    tree right;
    public tree(int n){
        val = n;
        left = null;
        right = null;
    }
}
