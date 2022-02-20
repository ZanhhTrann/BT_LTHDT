import java.util.Scanner;
public class BinarySearchTree {
    static class Node {
        //instance variable of Node class
        public int data;
        public Node left;
        public Node right;

        //khoi tao node
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // khoi tao goc
    public Node root;

    // constructor for initialise the root to null BYDEFAULT
    public BinarySearchTree() {
        this.root = null;
    }
    //ham nhap cac phan tu vao cay
    public void InputNode(int num){
        this.root= InputNode(this.root,num);
    }
    public Node InputNode(Node root ,int num){
        if(root==null){
            root = new Node(num);
            return root;
        }else{
            if(root.data>num){
                root.left=InputNode(root.left,num);
            }else{
                root.right=InputNode(root.right,num);
            }
            return root;
        }
    }
    //ham duyet pre
    public void TraverPreOrder() {
        TraverPreOrder(this.root);
    }
    public void TraverPreOrder(Node root) {
        if(root!=null){
            System.out.print(root.data + " " );
            TraverPreOrder(root.left);
            TraverPreOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // tao 1 cay tim kiem nhi phan co ten la bst
        BinarySearchTree bst = new BinarySearchTree();
        int n,i,num;
        System.out.print("nhap so nut cua cay: ");
        n=scanner.nextInt();
        for(i=0;i<n;i++){ 
            System.out.print("nhap nut: ");
            num= scanner.nextInt();
            bst.InputNode(num);
        }
        bst.TraverPreOrder();
    }
}