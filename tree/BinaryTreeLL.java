
import java.util.LinkedList;
import java.util.Queue;

class Node {
    public String value;
    public Node left;
    public Node right;
    public int height;
}

public class BinaryTreeLL {
    Node root;

    public BinaryTreeLL() {
        this.root = null;
    }

    // preorder traversal
    void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //  inOrder traversal
    void inOrder(Node node)
    {
        if (node == null) {
            return;
        }

        
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // postorder traversal
    void postOrder(Node node)
    {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    //level order traversal
    void levelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node presentNode = queue.remove();
            System.out.print(presentNode.value + " ");

            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    // search method
    public void search(String value) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node presentNode = queue.remove();

            if (presentNode.value.equals(value)) {
                System.out.println("Value found: " + value);
                return;
            }

            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }

        System.out.println("Value not found: " + value);
    }

    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();

        Node N1 = new Node();
        N1.value = "N1";

        Node N2 = new Node();
        N2.value = "N2";

        Node N3 = new Node();
        N3.value = "N3";

        Node N4 = new Node();
        N4.value = "N4";

        Node N5 = new Node();
        N5.value = "N5";
           Node N6 = new Node();
        N6.value = "N6";
           Node N7 = new Node();
        N7.value = "N7";
           Node N8 = new Node();
        N8.value = "N8";
           Node N9 = new Node();
        N9.value = "N9";

        binaryTree.root = N1;
        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        
         N3.left = N6;
        N3.right = N7;
         N4.left = N8;
        N4.right = N9;
        binaryTree.root = N1;
        binaryTree.levelOrder();

        // System.out.print("Preorder traversal: ");
        // binaryTree.preOrder(binaryTree.root);

        //  binaryTree.inOrder(binaryTree.root);
        //binaryTree.postOrder(binaryTree.root);
    }
}

