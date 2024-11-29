public class Tree {
    void insert(Node node , int x){
        if(node.data > x){
            if(node.left == null){
                node.left = new Node(x);
            }else{
                insert(node.left, x);
            }
        }else{
            if(node.right==null){
                node.right =new Node(x);
            }else{
                insert(node.right, x);
            }
        }
    }

    void inorder(Node node){ 
        if(node==null) return;
        inorder(node.left);
        System.out.println(node.data);  
        inorder(node.right);  
    }

    void preOrder(Node node){
        if(node==null) return;
        System.out.println(node.data);
        inorder(node.left);       
        inorder(node.right);
    }

    void postOrder(Node node){
        if(node == null) return;
        inorder(node.left);       
        inorder(node.right);
        System.out.println(node.data);
    }


    public static void main(String[] args) {
        Node root = new Node(6);
        Tree tree = new Tree();
        tree.insert(root,5);
        tree.insert(root,5);
        tree.insert(root,8);
        tree.insert(root,5);
        tree.insert(root,13);
        tree.insert(root,5);

        tree.inorder(root);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int x){
        this.data=x;
    }
}

// Node root = new Node(6)